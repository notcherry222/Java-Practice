package 백준.실버.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 1051
 * 10:55 -11:9
 * 9:23
 */
public class 숫자정사각형 {
    static int n,m,answer;
    static int map[][];
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for(int i =0;i<n;i++) {
            String line[] = br.readLine().split("");
            for(int j = 0; j<m;j++) {
                map[i][j] = Integer.parseInt(line[j]);

            }
        }
        answer = 1;

        for(int i =0;i<n;i++){
            for(int j = 0; j<m;j++){
                for(int dx = 0; dx<m;dx++) {
                    if (dx + i < n && dx + j < m) {
                        if (map[i][j] == map[i + dx][j] && map[i + dx][j] == map[i + dx][j + dx] && map[i][j + dx] == map[i + dx][j + dx]) {
                            int temp = (dx + 1) * (dx + 1);
                            answer = Math.max(temp, answer);
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }


}
