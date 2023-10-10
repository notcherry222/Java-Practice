import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 6 4
 * 0 0 0 0 0 0
 * 0 1 0 0 3 0
 * 0 0 0 0 0 0
 * 0 0 0 2 0 0
 * 0 4 0 0 0 0
 * 0 0 0 0 0 0
 *
 * 13
 *
 *
 * 3 9
 * 1 5 6
 * 7 8 9
 * 2 4 3
 * 13
 */

public class four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeInput = br.readLine().split(" ");
        int n = Integer.parseInt(sizeInput[0]); // 공간의 크기 N
        int k = Integer.parseInt(sizeInput[1]); // 구름이가 남긴 기록의 수 K

        int[][] grid = new int[n][n]; // 격자 초기화
        int[] posX = new int[k + 1]; // 구름이의 위치 (x 좌표)
        int[] posY = new int[k + 1]; // 구름이의 위치 (y 좌표)
        int moves = 0; // 이동한 칸의 수

        // 구름이의 위치 초기화
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int step = Integer.parseInt(st.nextToken()); // 구름이의 기록
                grid[i][j] = step;

                if (step != 0) {
                    posX[step] = i;
                    posY[step] = j;
                }
            }
        }

        // 구름이의 위치를 기준으로 이동한 칸의 수 계산
        for (int step = 1; step <= k; step++) {
            int targetX = posX[step];
            int targetY = posY[step];
            int deltaX = Math.abs(targetX - posX[step - 1]);
            int deltaY = Math.abs(targetY - posY[step - 1]);
            moves += deltaX + deltaY;
        }

        System.out.println(moves);
    }
}

