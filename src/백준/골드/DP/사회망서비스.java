package 백준.골드.DP;

import java.io.*;
import java.util.*;

public class 사회망서비스 {
    static int n;
    static ArrayList<Integer>[] a;
    static int dp[][];
    static boolean v[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new ArrayList[n+1];
        dp = new int [n+1][2];
        v = new boolean [n+1];
        for(int i =0; i<=n; i++) {
            a[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i =0;i<n-1;i++) {
            st = new StringTokenizer(br.readLine());
            int a1 =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            a[a1].add(b);
            a[b].add(a1);
        }
        dfs(1);
        System.out.println(Math.min(dp[1][0], dp[1][1]));
    }
    static void dfs(int i) {
        v[i] = true;
        dp[i][0] = 0; //아닌 경우
        dp[i][1] = 1; //얼리어답터가 맞는 경우
        for(int n : a[i]) {
            if(!v[n]) {
                dfs(n);
                dp[i][0] += dp[n][1];
                dp[i][1] += Math.min(dp[n][0], dp[n][1]);
            }
        }
    }
}
