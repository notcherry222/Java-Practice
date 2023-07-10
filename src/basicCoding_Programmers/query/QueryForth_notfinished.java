package basicCoding_Programmers.query;

public class QueryForth_notfinished {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for(int j = 0; j<queries.length;j++){
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            //s<=i<=e

            for(int i =s ; i<=e ; i++){
                if(s == 0){arr[i]+=1;}
                if(k%i == 0){
                    arr[i] += 1;
                }
            }
        }
        //k%i == 0 -> arr[i] +=1
        return arr;
    }
}
