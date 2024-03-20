package 백준.실버.탐색;

import java.io.*;
import java.util.*;

/**
 * 9:18
 */
public class 컴백홈 {
    static boolean v[][];
    static char map[][];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int r,c,k,count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken()); //세로
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken()); //거리
        count = 0; // 칸 수가 거리
        v = new boolean[r][c];
        map = new char[r][c];
        for(int i = 0; i<r;i++) {
            String command = br.readLine();
            for(int j =0; j<c;j++) {
                map[i][j] = command.charAt(j);
                if(map[i][j] == 'T') {
                    v[i][j] = true;
                }
            }
        }
        bfs(r-1,0,1); //도착지는 map[0][c-1]
        System.out.println(count);
    }
    static void bfs(int i ,int j,int depth) {
        v[i][j] = true;
        if(i == 0 && j == c-1) {
            if(depth == k) {
                count++;
                return;
            }
        }
         for(int w = 0; w<4;w++) {
             int x = i+dx[w];
             int y = j+dy[w];
             if(x>=0 && y>=0 && x<r && y<c) {
                 if(!v[x][y]) {
                     v[x][y] = true;
                     bfs(x,y,depth+1);
                     v[x][y] = false;
                 }
             }
         }
    }
}
