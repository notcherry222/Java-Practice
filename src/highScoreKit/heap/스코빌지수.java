package highScoreKit.heap;

import java.util.PriorityQueue;

/**
 * return -1인 경우
 * a는 존재하고 b는 존재하지 않을 경우
 * return 0 인경우
 * 모든 scoville이 이미 K이상인 경우
 */

public class 스코빌지수 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int n : scoville) {
            q.offer(n);
        }
       while(q.peek()<K){
            int a = q.poll();
            if(q.isEmpty()){
                return -1;}
            else {
                int b = q.poll();
                if (b < K) {
                    q.offer(a + (b * 2));
                    answer++;
                } else  {
                    return -1;
                }
            }
        }
        return answer;
    }
}
