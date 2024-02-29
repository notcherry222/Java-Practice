package 백준.실버.그리디;

import java.util.Scanner;

public class 동전개수의_최솟값_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }

        //그리디 알고리즘 -> 최대한 큰 동전을 먼저 사용하기
        int count = 0;
        for(int i = n-1; i>=0; i--) {
            if(a[i] <= k) {
                count += (k/a[i]); // 사용한 동전 수
                k = k%a[i];
            }
        }
        System.out.println(count);
    }
}
