package 백준.실버.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 10828번
 * push X : x를 스택에 넣음
 * pop: 가장 위의 정수 빼고 출력(없으면 -1)
 * size: 스택에 들어있는 정수 개수
 * empty: 비어있으면 1, 아님 0
 * top: 가장 위의 정수 출력(-1)
 */
public class 스택 {
    private static Stack<Integer> answer = new Stack<>();
    private static void check(String[] c) {
        switch (c[0]) {
            case "push" : answer.push(Integer.parseInt(c[1])); break;
            case "pop" :
                if (!answer.isEmpty()) {
                    System.out.println(answer.pop());
                } else {
                    System.out.println("-1");
                } break;
            case "size" :
                System.out.println(answer.size()); break;
            case "empty" :
                if (!answer.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println("1");
                } break;
            case "top" :
                if (!answer.isEmpty()) {
                    System.out.println(answer.peek());
                } else {
                    System.out.println("-1");
                } break;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());


        for (int i = 0; i<tc; i++){
            String[] command = br.readLine().split(" ");
            check(command);
        }
    }
}
