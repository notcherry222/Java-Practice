package highScoreKit.완전탐색;

import java.util.*;


public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<answers.length; i++){
            if(answers[i] == student1[i]){
                cnt1++;}

            if(answers[i] == student1[i]){
                cnt2++;}

            if(answers[i] == student1[i]) {
                cnt3++;}
        }
        map.put(1, cnt1);
        map.put(2, cnt2);
        map.put(3, cnt3);

        //최댓값을 찾기 위한 변수 초기화 (-2147483648)
        int max = Integer.MIN_VALUE;

        //가장 큰 값을 가진 key들을 저장할 리스트
        List<Integer> maxKeys = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int value = entry.getValue();
            //최댓값 갱신
            if(value > max){
                max = value;
                maxKeys.add(entry.getKey());
            } if(value == max) {
                maxKeys.add(entry.getKey());
            }
        }

        int[] answer = new int[maxKeys.size()];
        for(int i =0; i<maxKeys.size(); i++){
            answer[i] = maxKeys.get(i);
        }
        return answer;
    }
}
