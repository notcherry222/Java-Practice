package 백준.실버.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 원하는_정수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        for(int i =0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<m; i++) {
            boolean find = false;
            int target = sc.nextInt();
            int start = 0;
            int end = a.length-1;
            while (start <= end){
                int mid_index = (start + end)/2;
                int mid_value = a[mid_index];
                if(mid_value>target) {
                    end = mid_index-1;
                } else if (mid_value<target) {
                    start=mid_index+1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find)System.out.println(1);
            else System.out.println(0);
        }

    }
}
