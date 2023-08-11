package highScoreKit.que;

import java.util.LinkedList;
import java.util.Queue;

public class 올바른괄호 {
    boolean solution(String s) {
        Queue<Character> queue = new LinkedList<>();
        boolean answer = true;

        for (int i = 0; i <s.length(); i++){
            queue.offer(s.charAt(i));
        }


        return answer;
    }
}
