package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이항계수_1 {
    static int n,k;
    static int d[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        d = new int[n+1][n+1];
        //초기화
        for (int i = 0; i<= n; i++) {
            d[i][i] = 1;
            d[i][0] = 1;
            d[i][1] = i;
        }
        //점화식으로 배열 완성하기
        for (int i =2; i<=n; i++) {
            for (int j = 1; j<i; j++) {
                d[i][j] = d[i-1][j] + d[i-1][j-1];
            }
        }
        System.out.println(d[n][k]);
    }
}
