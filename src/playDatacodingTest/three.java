import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 5 5
 * 1 2
 * 1 3
 * 2 3
 * 2 4
 * 1 5
 *
 * 1
 */

class three {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //후보들의 득표수 저장
        Map<Integer,Integer> cntResult = new HashMap<>();

        for(int i =0; i<n ; i++){
            String[] input = br.readLine().split("");
            String type = input[0];
            int num = Integer.parseInt(input[2]);

            if(type.equals("A")) {
                cntResult.put(num, cntResult.getOrDefault(num,0)+3);
            } else if(type.equals("B")) {
                cntResult.put(num, cntResult.getOrDefault(num,0)+2);
            } else{
                cntResult.put(num, cntResult.getOrDefault(num, 0)+1);
            }
        }
        int maxCnt = 0;
        int winner = 0;

        for(Map.Entry<Integer, Integer> entry: cntResult.entrySet()) {
             int candidate = entry.getKey();
             int vote = entry.getValue();

             if(vote>maxCnt) {
                 maxCnt = vote;
                 winner = candidate;
             }
        }
        System.out.println(winner);
    }
}