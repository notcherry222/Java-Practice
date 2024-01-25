package 백준.골드.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 탑 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<int []> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int top = Integer.parseInt(st.nextToken());
            while(!stack.empty()){
                if(stack.peek()[0] > top){
                    answer.append(stack.peek()[1] + " ");
                    break;
                }
                stack.pop();
            }
            if(stack.empty())
                answer.append("0 ");
            stack.push(new int[] {top, i});
        }
        System.out.println(answer);
    }
}
