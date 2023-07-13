package basicCoding_Programmers.query;

import java.util.Arrays;

public class QuerySecond {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int j = 0; j<queries.length;j++){
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            int p =0;
            //s<=i<=e
            int[] pre = new int[e-s+1];

            for(int i = s; i<=e ; i++){
                pre[p]= arr[i];
                p+=1;
            }
            Arrays.sort(pre);

            for(int i =0 ; i< pre.length; i++){
                if(pre[i]>k){
                   answer[i] =pre[i];
                   break;
                }else{
                    answer[j]= -1;
                }
            }
        }
        //k%i == 0 -> arr[i] +=1
        return answer;
    }
}
