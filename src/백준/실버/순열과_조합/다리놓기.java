package 백준.실버.순열과_조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1010
public class 다리놓기 {
    private static final int[][] dp = new int[31][31];

    static int comb( int n, int r) {
        // 이미 계산된 값인 경우
        if( dp[n][r] > 0) {
            return dp[n][r];
        }
        // 원소의 개수가 조합의 개수와 동일하거나 0인 경우
        else if(r == 0 || r == n) {
            return dp[n][r] = 1;
        }
        // 일반적인 경우
        else {
            return dp[n][r] = comb(n-1, r-1) + comb(n-1, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++) {
            String[] lines = br.readLine().split(" ");
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[1]);

            System.out.println(comb(b,a));

        }
    }
}
