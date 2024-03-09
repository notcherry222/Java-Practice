package 백준.골드.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 적록색약 { // 빨 == 초
    static int n,special,count;
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    static boolean visited[][];
    static char map[][];
    static char map_special[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        count = 0; // r,g,b
        special = 0;
        visited = new boolean[n][n];
        map = new char[n][n];
        map_special = new char[n][n];

        for(int i = 0; i<n; i++) {
            String line = br.readLine();
            for(int j = 0; j<n; j++) {
                map[i][j] = line.charAt(j);
                if(map[i][j] == 'G') {
                    map_special[i][j] = 'R';
                } else{
                    map_special[i][j] = map[i][j];
                }
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(!visited[i][j] && map[i][j] == 'R') {
                    bfs(i,j,'R');
                    count++;
                }
                if(!visited[i][j] && map[i][j] == 'G'){
                    bfs(i,j,'G');
                    count++;
                }
                if(!visited[i][j] && map[i][j] == 'B'){
                    bfs(i,j,'B');
                    count++;
                }
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                visited[i][j] = false;
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(!visited[i][j] && map_special[i][j] == 'R') {
                    bfs_s(i,j,'R');
                    special++;
                }

                if(!visited[i][j] && map_special[i][j] == 'B'){
                    bfs_s(i,j,'B');
                    special++;
                }
            }
        }
        System.out.print(count + " " + special);

    }
    public static void bfs(int i, int j, char ch) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i,j});
        visited[i][j] = true;

        while(!q.isEmpty()) {
            int now[] = q.poll();
            for(int k = 0; k<4 ;k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<n && y<n) {
                    if(!visited[x][y] && map[x][y] == ch) {
                        q.add(new int[] {x,y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }
    public static void bfs_s(int i, int j, char ch) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i,j});
        visited[i][j] = true;

        while(!q.isEmpty()) {
            int now[] = q.poll();
            for(int k = 0; k<4 ;k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<n && y<n) {
                    if(!visited[x][y] && map_special[x][y] == ch) {
                        q.add(new int[] {x,y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }

}
