package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for(int i =0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        //버블정렬
        for (int i = 0; i<n; i++ ) {
            for(int j =0; j<n-1-i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++) {
            System.out.println(a[i]);
        }
    }
}
