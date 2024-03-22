package 백준.골드.DP;

import java.io.*;
import java.util.*;

/**
 * 2:41
 */
public class 게임 {
    static int n,m,max;
    static boolean isCycle;
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    static int map[][], dp[][];
    static boolean v[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //세로
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        dp = new int[n][m];
        v= new boolean[n][m];
        //구멍에 빠지거나 보드 바깥은 아웃
        //무한번 움직일 수 있다면 -1
        for(int i = 0; i<n;i++) {
            String line = br.readLine();
            for(int j = 0; j<m;j++) {
                if(line.charAt(j) == 'H') {
                    map[i][j] = -1;
                } else {
                    map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
                }
            }
        }
        v[0][0] =true;
        bfs(0,0, 1);
        if(isCycle) {
            System.out.println(-1);
        } else{

            System.out.println(max);
        }
    }
    static void bfs(int i, int j, int depth) {
        if(depth>max) {
            max = depth;
        }
        dp[i][j] = depth;

        for(int k = 0; k<4; k++) {
            int x =i + dx[k]*map[i][j];
            int y = j + dy[k]*map[i][j];
            if(x>=0&&y>=0&& x<n && y<m && map[x][y] != -1) {
                if(dp[x][y] > depth) {
                    continue;
                }
                if(v[x][y]) {
                    isCycle = true;
                    return;
                }
                v[x][y] = true;
                bfs(x,y,depth+1);
                v[x][y] =false;
            }
            }

    }
}
