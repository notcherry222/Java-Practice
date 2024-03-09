package 백준.실버.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 섬의개수 {
    static int w,h;
    static int map[][];
    static boolean visited[][];
    static int answer;
    static StringBuilder sb = new StringBuilder();
    static int dx[] = {0,1,0,-1,1,-1,1,-1};
    static int dy[] = {1,0,-1,0,1,-1,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            //초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); //가로
            h = Integer.parseInt(st.nextToken()); //세로

            // 00 = finish
            if(w ==0 && w== h) break;

            visited = new boolean[h][w];
            map = new int[h][w];
            for (int i = 0; i < h; i++) {
                String line[] = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(line[j]);
                }
            }

            //탐색
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(!visited[i][j] && map[i][j] == 1) {
                        BFS(i,j);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
            answer= 0;
        }
    }

    public static void BFS(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i,j});
        visited[i][j] = true;
        while(!q.isEmpty()) {
            int now[] = q.poll();
            for(int k =0; k<8; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if(x>=0 && y>=0 && x<h && y<w) {
                    if(!visited[x][y] && map[x][y] == 1) {
                        visited[x][y] = true;
                        q.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
