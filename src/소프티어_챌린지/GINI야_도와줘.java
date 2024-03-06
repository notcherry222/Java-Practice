package 소프티어_챌린지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GINI야_도와줘 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static String[][] map;
    static boolean[][] visited;
    static int[][] count;
    static int l1, l2, h1, h2, w1, w2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        l1 = Integer.parseInt(first[0]);
        l2 = Integer.parseInt(first[1]);
        map = new String[l1][l2];
        visited = new boolean[l1][l2];
        count = new int[l1][l2];

        for(int i = 0; i<l1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j<l2; j++) {
                map[i][j] = line.substring(j,j+1);
                count[i][j] =0;
                if(map[i][j].equals("H")) {
                    h1 = i;
                    h2 = j;
                }
                if(map[i][j].equals("W")) {
                    w1 = i;
                    w2 = j;
                }
            }
        }

        BFS(h1,h2);
        if (count[w1][w2] == 0) {
            System.out.println("FAIL");
        } else {
            System.out.println(count[w1][w2]);
        }

    }
    private static void BFS(int i, int j) {
        visited[i][j] = true;
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[] {i,j});

        while (!q.isEmpty()) {
            int now[] = q.poll();
            visited[i][j] = true;

            for(int k =0; k<4; k++) {
                int x= now[0] + dx[k];
                int y= now[1] + dy[k];

                if(x>=0 && y>=0 && x<l1 && y<l2) {
                    if(!visited[x][y] && !map[x][y].equals("*") &&!map[x][y].equals("X") ) {
                        visited[x][y] = true;
                        count[x][y] = count[now[0]][now[1]] + 1;
                        q.add(new int[] {x,y});
                    }
                }

            }
        }

    }
}
