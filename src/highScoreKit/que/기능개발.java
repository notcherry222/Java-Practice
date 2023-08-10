package highScoreKit.que;
import java.util.*;

public class 기능개발 {
        public int[] solution(int[] progresses, int[] speeds) {

            List<Integer> answer = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();
            //작업 일수 구하기
            for(int i =0; i<progresses.length; i++){
                int num = 100-progresses[i];
                int el = num%speeds[i];
                queue.offer((el == 0)? el :el+1);
            }
            //배포 순서 정하기
            int next = queue.poll();
            int cnt = 1;

            for(int i = 1 ; i<progresses.length; i++){
                if(next>=queue.peek()){
                    cnt++;
                }else {
                    answer.add(cnt);
                    cnt=1;
                }
                next = Math.max(next,queue.poll());
            }
            answer.add(cnt);

            return answer.stream().mapToInt(n->n).toArray();
    }
}
