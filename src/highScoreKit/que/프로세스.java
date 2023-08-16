package highScoreKit.que;

import java.util.*;

public class 프로세스 {
    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for(int p: priorities){
           q.offer(p);
        }
        while(!q.isEmpty()){
            for(int i = 0; i<priorities.length; i++) {
                if(priorities[i] == q.peek()){
                    answer++;
                    if( i == location) {
                        return answer;
                    }
                }
//                else {  //if(priorities[i] == q.peek()) 부분 이해했다면 필요 없다는 것을 알테야!
//                    q.poll();
//                    answer++;
//                }
            }
        }
        return answer;
    }
}
