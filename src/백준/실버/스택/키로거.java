package 백준.실버.스택;

import java.io.*;
import java.util.Stack;

/**
 * < : 왼쪽으로 1칸
 * > : 오른쪽으로 1칸
 * - : 왼쪽에 있는 글자 삭제
 */
public class 키로거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(int i = 0; i<num; i++) {
            String str = br.readLine();

            for(char c : str.toCharArray()){
                switch (c) {
                    case '<' :
                        if(!left.isEmpty()){
                            right.push(left.pop());
                        }break;
                    case '>' :
                        if (!right.isEmpty()) {
                            left.push(right.pop());
                        }break;
                    case '-' :
                        if(!left.isEmpty()) {
                            left.pop();
                        } break;
                    default:
                        left.push(c);
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            while(!left.empty()) {
                right.push(left.pop());
            }
            while(!right.empty()) {
                sb.append(right.pop());
            }
            System.out.println(sb.toString());
        }
    }
}
