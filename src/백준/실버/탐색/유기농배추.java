package 백준.실버.탐색;

import java.io.*;
import java.util.*;

/**
 * 2:16 - 2:55
 */

public class 유기농배추 {
    static int t,m,n,k;
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    static boolean v[][];
    static int map[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int tc= 0; tc<t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); //가로
            n = Integer.parseInt(st.nextToken()); //세로
            k = Integer.parseInt(st.nextToken()); //배추 심은 개수
            v = new boolean[n][m];
            map = new int[n][m];
            int answer=0;
            for(int i = 0; i<k; i++) {
                String line[] = br.readLine().split(" ");
                int x =Integer.parseInt(line[0]);
                int y =Integer.parseInt(line[1]);
                map[y][x] = 1;
            }

            for(int i =0; i<n; i++) {
                for(int j =0; j<m; j++) {
                    if(map[i][j] ==1 &&!v[i][j]) {
                        bfs(i,j,1);
                        answer++;
                    }
                }
            }

            sb.append(answer + "\n");
        }
        System.out.println(sb.toString());
    }
    public static void bfs(int i, int j, int num) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i,j});
        v[i][j] = true;

        while(!q.isEmpty()) {
            int[] now = q.poll();
            for(int k = 0; k<4; k++) {
                int x = now[0]+dx[k];
                int y = now[1]+dy[k];

                if(x>=0 && x<n && y>=0 && y<m) {
                    if(!v[x][y] &&map[x][y] == num) {
                        v[x][y] =true;
                        q.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
