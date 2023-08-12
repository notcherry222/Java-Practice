package highScoreKit.que;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') { // 열린 괄호면 스택에 추가
                stack.push(c);
            } else if (c == ')') { // 닫힌 괄호면 짝을 이루는 열린 괄호를 찾아서 제거
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    answer = false; // 올바르지 않은 괄호
                    break;
                }
            }
        }
        if (!stack.isEmpty()) { // 스택에 남아있는 열린 괄호가 있다면 올바르지 않은 괄호
            answer = false;
        }
        return answer;
    }
}
