package highScoreKit.que;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
    public int solution(int[] priorities, int location) {

        Queue<Integer> q = new LinkedList<>();
        int answer = 0;

        for(int i =0 ; i<priorities.length;i++){
            q.offer(priorities[i]);
        }


        return answer;
    }
}
