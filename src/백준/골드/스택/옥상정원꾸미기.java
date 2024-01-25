package 백준.골드.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//4.18
public class 옥상정원꾸미기 {
    /**
     * 같거나 높으면 못 봄
     * 무조건 작아야
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        for (int i = 0; i<n; i++) {
            int top = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= top) {
                stack.pop();
            }
            stack.push(top);
            answer += stack.size()-1;
        }
        System.out.println(answer);
    }
}
