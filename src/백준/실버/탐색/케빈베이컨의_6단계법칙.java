package 백준.실버.탐색;

import java.io.*;
import java.util.*;

/**
 * 1389
 */
public class 케빈베이컨의_6단계법칙 {
    static ArrayList<Integer>[] a;;
    static int f[][];
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        f = new int[n+1][n+1];
        for(int i = 0; i<n; i++ ){
            for(int j = 0; j<n;j++) {
                f[n][n] = 0;
            }
        }
        for(int i = 0; i<m ;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            f[x][y] = f[y][x] = 1;
        }

        //플로이드 와샬 알고리즘
        for(int i = 1; i<n+1; i++ ){
            for(int j = 1; j<n+1;j++) {
                for(int k = 1; k<n+1; k++) {
                    if(f[i][j] > f[i][k] + f[k][j]) {
                        f[i][j] = f[i][k] + f[k][j];
                    }
                }
            }
        }

        int res = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 1; i<=n; i++) {
            int total = 0;
            for(int j = 1; j<=n; j++) {
                total += f[i][j];
            }
            if(res>total) {
                res = total;
                index = i;
            }
        }
        System.out.println(index);
    }
}
