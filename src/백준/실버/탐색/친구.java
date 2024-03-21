package 백준.실버.탐색;

import java.io.*;
import java.util.*;

/**
 * 9:19
 */
public class 친구 {
    static int n;
    static char map[][];
    static boolean v[][];
    static int f[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 사람 수
        f= new int[n];
        map = new char[n][n];
        v = new boolean[n][n];
        for(int i = 0; i<n;i++) {
            String line = br.readLine();
            for(int j = 0; j<n;j++) {
                map[i][j] = line.charAt(j);
            }
        }
        for(int i = 0; i<n;i++) {
            for(int j = 0; j<n;j++) {
                if (map[i][j] =='Y') {
                    if(!v[i][j]) {
                        f[i]++;
                        v[i][j] = true;
                    }
                    for(int k=0;k<n;k++) {
                        if(map[j][k]=='Y' && !v[i][k] && k !=i ) {
                            f[i]++;
                            v[i][k] =true;
                        }
                    }
                }
            }
        }
        Arrays.sort(f);
        System.out.println(f[n-1]);
    }
}
