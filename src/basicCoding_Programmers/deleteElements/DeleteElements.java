package basicCoding_Programmers.deleteElements;

import java.util.ArrayList;

public class DeleteElements {
    public int[] solution(int[] arr, int[] delete_list){

        ArrayList<Integer> answerList = new ArrayList<> ();

        for(int num : arr){

            Boolean isDelete = false;

            for(int deleteNum : delete_list){
                if(num == deleteNum) {
                    isDelete = true;
                    break;
                }
            }
            if(isDelete != true){
                answerList.add(num);
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0 ; i<answerList.size();i++ ){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
