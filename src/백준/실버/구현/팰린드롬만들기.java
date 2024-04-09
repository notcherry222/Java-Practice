package 백준.실버.구현;

import java.io.*;
import java.util.*;

/**
 * 5:22
 */
public class 팰린드롬만들기 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = input.length();
        int alpha[] = new int[26];
        for(int i = 0; i<size; i++) { //아스키 코드 사용해 해당 알파벳의 개수 세기
            alpha[input.charAt(i)-'A']++;
        }

        int center = 0;
        int odd =0; //홀수 개수 세기
        for(int i =0; i<alpha.length ;i++) {
            if(alpha[i]%2 != 0) {
                center = i;
                odd++;
            }
        }
        if(odd>1 || (size%2==0 && odd==1)){
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i<alpha.length;i++) {
            for(int j =0; j<alpha[i]/2; j++) {
                answer.append((char)(i+'A'));
            }
        }
        StringBuffer tmp = new StringBuffer(answer.toString());
        if(odd ==1) {
            answer.append((char)(center+'A'));
        }
        System.out.println(answer.toString()+tmp.reverse());
    }
}
