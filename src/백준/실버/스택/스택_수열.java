package 백준.실버.스택;

import java.io.*;
import java.util.*;

public class 스택_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int current = 0; //스택에 push 할 다음 숫자

        /**
         * 스택을 이용해 수열을 만들 수 있는지!
         */
        StringBuilder result = new StringBuilder();

        while(n -- >0) {
            int value = Integer.parseInt(br.readLine());
            if(value > current) {
                for(int i = current+1; i<=value;i++) {
                    stack.push(i);
                    result.append("+").append("\n");
                }
                current = value;
            }
            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            result.append("-").append("\n");
        }

        System.out.println(result);

    }
}
