package highScoreKit.heap;

import java.util.*;

public class 디스크_컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int l = jobs.length;

        for(int i = 0; i< jobs.length; i++){
            q.offer(jobs[0][i]);
        }

        while(!q.isEmpty()){
            if(q.){

            }
        }
        return answer/l;
    }
}
