package 백준.실버;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * L : 왼쪽으로 이동
 * D : 오른쪽으로 이동
 * B: 왼쪽에 있는 문자 삭제
 * P $ : $라는 문자를 커서 왼쪽에 추가
 */
public class 에디터 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("");
        int num = Integer.parseInt(br.readLine());

        Stack<String> left = new Stack<>(); //처음 커서
        Stack<String> right = new Stack<>();

        for(String i : input) {
            left.push(i);
        }

        for (int i =0; i<num; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L' :
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case 'D' :
                    if(!right.isEmpty()) {
                        left.pop();
                    }
                    break;
                case 'B' :
                    if(!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case 'P' :
                    char t = command.charAt(2);
                    left.push(String.valueOf(t));
                default: break;
            }

            while(!left.isEmpty())
                right.push(left.pop());

            while (!right.isEmpty())
                bw.write(right.pop());

            bw.flush();
            bw.close();;
        }
    }
}
