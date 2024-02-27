package 백준.실버.정렬;


import java.io.IOException;
import java.util.Scanner;

/**
 * 백준 1427
 * 선택정렬로 풀어보기
 */

public class 내림차순으로_자릿수_정렬하기 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a[] = new int[str.length()];

        for(int i =0; i<str.length();i++) {
            a[i] = Integer.parseInt(str.substring(i,i+1));
        }

        //선택정렬
        for(int i = 0; i<str.length();i++) {
            int max = i; //맨 앞에 있는 값이 최대값이라고 설정
            for(int j = i+1; j<str.length(); j++) {
                if (a[j] > a[max]) {
                        max = j;
                }
            }
            if(a[i]<a[max]) {
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }
        for (int i = 0; i<str.length();i++) {
            System.out.println(a[i]);
        }
    }
}
