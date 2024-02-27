package 백준.실버.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * BFS 넓이 우선 탐색
 * 백준 2178
 */

public class 미로탐색 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0}; //각각 위, 오른쪽, 아래, 왼쪽으로 탐색해라!
    static boolean[][] visited;
    static int[][] a;
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m]; //미로 지도
        visited = new boolean[n][m];
        //미로 지도 초기화
        for (int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j=0;j<m;j++){
                a[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(a[n-1][m-1]);
    }
    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>(); //bfs는 큐로 구현
        queue.offer(new int[] {i,j});
        while (!queue.isEmpty()){
            int now[] = queue.poll();
            visited[i][j] = true;
            for (int k = 0; k<4; k++) {
                //상하좌우로 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dx[k];
                if (x>=0 && y>=0 && x<n &&y<m) { //배열을 넘어가면 안됨
                    if(a[x][y] != 0 && !visited[x][y]){ //0이어서 갈 수 없거나 들른 곳은 안됨
                        //갈 수 있는 곳
                        visited[x][y] = true;
                        a[x][y] = a[now[0]][now[1]] +1; //핵심 포인트
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
