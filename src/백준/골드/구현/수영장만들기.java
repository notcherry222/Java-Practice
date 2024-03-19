package 백준.골드.구현;

import java.io.*;
import java.util.*;

/**
 * 1113
 * 2:21
 */
public class 수영장만들기 {
    static int n,m,total;
    static int map[][];
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    static boolean visited[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        //0 -> 물 흡수
        //물 최대 몇?
        map = new int[n][m];
        total = 0;
        for(int i =0;i<n;i++) {
            String line[] = br.readLine().split("");
            for(int j = 0; j<m; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        visited = new boolean[n][m];
        for(int q = 1; q<9; q++) { //낮은 수부터 bfs 탐색
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(map[i][j] == q && !visited[i][j]) {
                        BFS(i,j,q);
                    }
                }
            }
        }
        System.out.println(total);
    }
    public static void BFS(int i, int j, int num) {
        visited[i][j] = true;
       Queue<int[]> q = new LinkedList<>();
       q.add(new int[] {i,j});
       List<int[]> candi = new ArrayList<>();
       candi.add(new int[] {i,j}); // 임시 배열
       int minH = Integer.MAX_VALUE;
       boolean flood = false;
       while(!q.isEmpty()) {
           int[] now = q.poll();
           if(now[0] == 0 || now[1]==0 || now[0] == n-1 || now[1] == m-1) {//테두리라면 범람
               flood = true;
           }
           for(int k = 0; k<4; k++) {
               int x =now[0] + dx[k];
               int y =now[1] + dy[k];
                //물 웅덩이 탐색
               if(x>=0 && x<n && y>=0 && y<m) {
                   if(!visited[x][y] && map[x][y] == num) {
                       visited[x][y] = true;
                       q.add(new int[] {x,y});
                       candi.add(new int[] {x,y});
                   }
                   if(map[x][y] < num) { //내 옆 벽이 나보다 낮으면 범람
                       flood = true;
                   }
                   if(map[x][y]>num) { //나보다 크면 벽이됨
                       minH = Math.min(minH, map[x][y]); //둘러싼 벽 중 가장 낮은 벽
                   }
               }
           }
       }

       if(!flood) { //물이 넘치지 않았다면
           total += candi.size() * (minH - num);
           for(int k = 0; k<candi.size(); k++) {
               int now[] = candi.get(k);
               map[now[0]][now[1]] = minH; //낮은 웅덩이부터 물 채우기
               visited[now[0]][now[1]] = false;
           }
       }
    }
}
