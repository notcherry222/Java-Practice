package highScoreKit.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> op = new PriorityQueue<>();
        int max = 0;
        int min = 0;

        for(int i = 0 ; i<operations.length; i++){
            if(operations[i].contains("I")){
                op.offer(Integer.parseInt(operations[i].substring(2, operations.length)));
            }else if(operations[i].equals("D 1")){
                max++;
            }else {
                min++;
            }
        }
        if(op.size()<=max+min){
            return new int[]{0,0};
        }else {
            for (int i = 0; i < min; i++) {
                op.poll();
            }
            answer[0] = op.peek();

            Comparator.reverseOrder();

            for (int i = 0; i < max; i++) {
                op.poll();
            }
            answer[1] = op.poll();
        }
        return answer;
    }
}
