package highScoreKit.que;

import java.util.*;

public class 프로세스 {
    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for(int i = 0; i<priorities.length; i++){
           q.offer(priorities[i]);
        }

        while(!q.isEmpty()){
            for(int i =0; i<priorities.length; i++){
                if(priorities[i] == q.peek()){
                    answer++;
                    return answer;
                }
                q.poll();
                answer++;
            }
        }
        return answer;
    }
}
