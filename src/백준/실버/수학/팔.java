package 백준.실버.수학;

import java.util.Scanner;

/**
 * 1105
 * 3:25
 */

public class 팔 {
    static int answer;
    static String r,l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.next();
        r = sc.next();
        int answer = 0;
        if(l.length() != r.length()) {
            System.out.println(0);
        } else {
            for(int i =0; i <l.length(); i++) {
                if(l.charAt(i) != r.charAt(i)){
                    break;
                } else{
                    if(l.charAt(i) == '8') {
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
