package 백준.골드.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] box;
    static int n, m;
    static int tomato; // 익은+안익은 토마토
    static int real;
    static Queue<int []> starts = new LinkedList<>();
    static int answer, count;
    public static void main(String[] args) throws IOException {
        // 문제 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        box = new int[m][n];
        visited = new boolean[m][n];
        int total = n*m;
        int empty = 0;
        answer = 0;
        count  = 0;

        for (int i = 0; i<m; i++) {
            String command[] = br.readLine().split(" ");
            for (int j = 0; j<n; j++) {
                box[i][j] = Integer.parseInt(command[j]);
                if(box[i][j] == -1) {
                    empty++;
                    visited[i][j] = true;
                }
                if (box[i][j] == 1) {
                    starts.offer(new int[] {i,j});
                }
            }
        }
        tomato = total - empty; // 답이 -1인 경우 고려할 때 사용할 필드 값
        real = starts.size();
        int first = starts.size();

        while (!starts.isEmpty()) {
            int[] line = starts.poll();
            BFS(line[0], line[1]);
            if ( first == count ) {
                first = starts.size();
                count = 0;
                answer++;
            }
        }

        //답변 출력
        if (real == tomato) {
            System.out.println(answer-1);
        } else {
            System.out.println("-1");
        }
    }

    private static void BFS(int i, int j) {

        visited[i][j] = true;

        for (int k = 0; k<4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >=0 && y>=0 && x<m && y<n){
                if (!visited[x][y] && box[x][y] == 0) {
                    visited[x][y] =true;
                    box[x][y] += 1;
                    starts.add(new int[]{x, y});
                    real++;
                }
            }
        }
        count++;

    }
}
