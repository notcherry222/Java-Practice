package 백준;

import java.util.Scanner;

public class Main {
    private static int N ,K;
    private static int dp[][], w[], v[]; // dp 배열과 무게, 가치 배열
    public static void main(String[] args) {
        //문제에 해당 변수들 설정
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        dp = new int[N+1][K+1];
        w = new int[N+1];
        v = new int[K+1];

        for(int i = 1; i<=N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for(int i =1 ;i<=N; i++) {
            for(int j = 1; j<=K ; j++) {
                dp[i][j] = dp[i-1][j];
                if(j-w[i]>=0) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]+v[i]]);
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}
