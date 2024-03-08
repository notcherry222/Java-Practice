package 백준.실버.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 전투_강사님_추천 {
    static int n, m, count;
    static boolean[][] visited;
    static char map[][];
    static int dx[]= {0,1,0,-1};
    static int dy[]= {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //가로
        m = Integer.parseInt(st.nextToken()); //세로
        int blue = 0;
        int white = 0;
        visited = new boolean[m][n];
        map = new char[m][n];
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            for(int j=0; j<n; j++) {
                char ch = temp.charAt(j);
                map[i][j] = ch;
            }
        }

        for(int i = 0; i<m;i++) {
            for (int j =0; j<n; j++){

                if(!visited[i][j]) {
                    if(map[i][j] == 'B') {
                        int num = BFS(i,j,'B');
                        blue += num * num;
                    }
                    if(map[i][j] == 'W') {
                        int num = BFS(i,j,'W');
                        white += num * num;
                    }
                }

            }
        }
        System.out.println(white + " " + blue);
    }

    public static int BFS(int i, int j, char ch){
        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i,j});
        count = 1;

        while(!q.isEmpty()) {
            int now[] = q.poll();
            for(int k = 0; k<4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<m && y<n) {
                    if (!visited[x][y] && ch == map[x][y]) {
                        visited[x][y] = true;
                        q.add(new int[] {x,y});
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
