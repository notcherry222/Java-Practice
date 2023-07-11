package basicCoding_Programmers.arrange;

import java.util.ArrayList;

public class Arrange4_notfinished {
    class Solution {
        public int[] solution(int[] arr) {

            ArrayList<Integer> stk = new ArrayList<>();
            int i = 0;

            while(i<arr.length){
                if(stk.size() == 0){
                    stk.add(arr[i]);
                    i += 1;
                }
                else{
                    int last = stk.get(stk.size()-1);
                    if(last < arr[i]){
                        stk.add(arr[i]);
                        i += 1;
                    }else{stk.remove(stk.size()-1); }
                }
            }
            int answer [] = new int[stk.size()];
            for(int j = 0; j<stk.size(); j++){
                answer[j] = stk.get(j).intValue();
            }

            return answer;
        }
    }
}
