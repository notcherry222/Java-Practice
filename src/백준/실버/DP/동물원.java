package 백준.실버.DP;

import java.io.*;
import java.util.*;

/**
 * 12:09
 */
public class 동물원 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long count =0l;
        long m[][] = new long[n+1][3];
        m[1][0] = m[1][1] = m[1][2] =1;
        for(int i = 2; i<=n ; i++) {
            m[i][0] =( m[i-1][0]+m[i-1][1]+m[i-1][2])%9901;
            m[i][1] = (m[i-1][0]+m[i-1][2])%9901;
            m[i][2] =( m[i-1][0]+m[i-1][1])%9901;
        }

        count=m[n][0]+m[n][1]+m[n][2];
        System.out.println(count%9901);
    }
}
