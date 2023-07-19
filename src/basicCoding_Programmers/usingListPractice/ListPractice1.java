package basicCoding_Programmers.usingListPractice;

import java.util.ArrayList;

//'x'를 기준으로 나눴을 때 나눠진 문자열의 각각 길이를 순서대로 저장한 배열을 return
//myString : "oxooxoxxox" result : [1, 2, 1, 0, 1, 0]
public class ListPractice1 {
    public int[] solution(String myString) {

        ArrayList<Integer> b = new ArrayList<> ();
        int length = 0;

        for(char ch : myString.toCharArray()){
            if(ch != 'x'){
                length++;
            }else{
                b.add(length);
                length = 0;
            }
        }
        //마지막 length 넣기
        if(length>=0){
            b.add(length);
        }

        int[] answer = new int[b.size()];
        for(int i =0; i<b.size() ; i++){
            answer[i] = b.get(i);
        }
        return answer;

    }

}
