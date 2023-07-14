package basicCoding_Programmers.arrange;

import java.util.ArrayList;

public class Arrange5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> result = new ArrayList<>();

        for(String str : intStrs){
            String a = str.substring(s,l+s);
            if( Integer.parseInt(a)>k ){
                result.add(Integer.parseInt(a));
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i<result.size();i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
