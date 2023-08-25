package highScoreKit.que;

import java.util.Stack;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack();

        for(int i  =0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i-stack.peek(); //todo : peek + pop = poll 아닌가요? -> 런타임 에러 발생
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            answer[stack.peek()] = prices.length-stack.peek() -1;
            stack.pop();
        }
        return answer;
    }
}
