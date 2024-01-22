package 백준.실버.스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 0 <=K <=1000000 정수
 * 0 : 가장 최근에 쓴 수 삭제, 아닐 경우는 쓴다
 * 정수가 0인 경우에 지울 수 있는 수가 있음을 보장
 */
public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer tc = Integer.parseInt(br.readLine());
        Stack<Integer> answers = new Stack<>();
        StringTokenizer st;

        for(int i =0 ; i<tc; i++) {
//            Integer command = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if(command == 0) {
                answers.pop();
            } else{
                answers.push(command);
            }
        }

        int answer = 0;
        for(int i : answers){
            answer += i;
        }

        System.out.println(answer);
    }
}
