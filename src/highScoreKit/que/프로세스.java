package highScoreKit.que;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
    public int solution(int[] priorities, int location) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(priorities[0]);

        for(int i = 1;i<priorities.length; i++){
            if(q.peek() >=priorities[i]) {
                q.offer(priorities[i]);
            }else{
                while(!q.isEmpty() && q.peek()<priorities[i]){
                    q.poll();
                }
                q.offer(priorities[i]);
            }
        }

        return ((LinkedList<Integer>) q).get(location);
    }
}
