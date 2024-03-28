package 백준.실버.순열과_조합;

import java.util.Scanner;

public class 순열_15650 {
    public static int[] arr;
    public static int n,m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        dfs(0,0);
        System.out.println(sb);
    }
    static void dfs(int at, int depth) {
        if(depth == m) {
            for(int n : arr) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i =at; i<n ;i++) {
            arr[depth] = i+1;
            dfs(i+1, depth+1);
        }
    }
}
