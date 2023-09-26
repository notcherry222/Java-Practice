package highScoreKit.완전탐색;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class 소수찾기 {
    static Set<Integer> set; //자동 중복제거
    static boolean[] visited; //백트래킹을 위한 불린 값
    static String[] part; // String number split 배열

        //백트래킹 알고리즘 : 모든 수의 조합
        private void permutation(int index, String sum) {
            if (!sum.isEmpty()) {
                set.add(Integer.parseInt(sum));
            }
            for (int i = 0; i < part.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    permutation(index + 1, sum + part[i]);
                    visited[i] = false;
                }
            }
        }
        //소수 알고리즘 : 소인수인 판별
        private boolean isPrimeNumber(int number){
            if(number<=1){
                return false;
            }
            for(int i =2; i<=Math.sqrt(number);i++){
                if(number%i==0){
                    return false;
                }
            }return true;
        }
        private int getAnswer(){
            return set.stream().filter(this::isPrimeNumber)
                    .collect(Collectors.toList()).size();
        }

    public int solution(String numbers) {

        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        part = numbers.split("");

        permutation(0,"");
        return getAnswer();
    }
}
