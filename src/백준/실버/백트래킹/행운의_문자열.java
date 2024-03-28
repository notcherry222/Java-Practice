package 백준.실버.백트래킹;

import java.io.*;
import java.util.*;

public class 행운의_문자열 {
    static char a[];
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n=s.length();
        a = new char[s.length()];
        for(int i =0; i<s.length();i++) {
            a[i] = s.charAt(i);
        }
        for(int i = 0; i<n;i++) {
            for(int j = i;j<n;j++) {
                char tmp = a[i];
                for(int k = 0; k<j;k++) {
                    a[k] = a[k+1];
                }
                a[j] = tmp;
                answer+=count(a);
            }
        }
        System.out.println(answer);
    }
    static void tracking (char[] arr ){
         
    }
    static int count (char[] arr) {
        boolean check = true;
        for(int i = 1; i<arr.length-1; i++) {
            if(arr[i-1] == arr[i] || arr[i] == arr[i+1]) {
                check = false;
            }
        }

        if(check) {
            return  1;
        } else{
            return 0;
        }
    }
}
