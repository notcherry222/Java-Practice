package highScoreKit.정렬;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class H_index {
    public int solution(int[] citations) {

        int cnt = 0;
        Arrays.sort(citations);

        for(int i =0 ; i<citations.length; i++){
            if(citations[i] <= citations.length -i){
                return citations[i];
            }
        }
        return cnt;
    }
}
