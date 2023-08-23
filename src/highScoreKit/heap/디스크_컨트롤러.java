package highScoreKit.heap;

import java.util.*;

public class 디스크_컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[][]> q = new PriorityQueue<>();

        for(int i =0; i<jobs.length; i++){
            for(int j =0; j<jobs[i].length; j++) {
                q.offer(jobs);
            }
        }
        while(!q.isEmpty()){

            q.poll();
        }
        return answer;
    }
}
