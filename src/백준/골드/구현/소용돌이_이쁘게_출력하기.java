package 백준.골드.구현;

import java.util.Scanner;

/**
 *     -3 -2 -1  0  1  2  3
 *     --------------------
 * -3 |37 36 35 34 33 32 31
 * -2 |38 17 16 15 14 13 30
 * -1 |39 18  5  4  3 12 29
 *  0 |40 19  6  1  2 11 28
 *  1 |41 20  7  8  9 10 27
 *  2 |42 21 22 23 24 25 26
 *  3 |43 44 45 46 47 48 49
 */

public class 소용돌이_이쁘게_출력하기 {

                private static int[][] map;
                private static int[][] dir = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };

                public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int r1 = sc.nextInt();
                        int c1 = sc.nextInt();
                        int r2 = sc.nextInt();
                        int c2 = sc.nextInt();
                        // 결과를 담을 배열
                        int h = r2 - r1 + 1;
                        int w = c2 - c1 + 1;
                        map = new int[h][w];

                        // 배열에 값 채우기
                        int x = 0, y = 0, d = 0, num = 1, cnt = 0, wCnt = 0, dCnt = 1;
                        while (true) {
                                // 배열을 다 채우면 벗어남
                                if(wCnt == h*w) {
                                        break;
                                }
                                if (x >= r1 && x <= r2 && y >= c1 && y <= c2) {
                                        map[x - r1][y - c1] = num;
                                        wCnt++;
                                }
                                num++;
                                cnt++;
                                x = x + dir[d][0];
                                y = y + dir[d][1];
                                if (cnt == dCnt) {
                                        cnt = 0;
                                        // 좌나 우로 값을 채울때 칸이 하나씩 늘어남
                                        if (d == 1 || d == 3) {
                                                dCnt++;
                                        }
                                        d = (d + 1) % 4;
                                }
                        }
                        // 예쁘게 출력시키기
                        int blank = (int)(Math.log10(num)+1); //자릿수 구하기
                        for (int i = 0; i < h; i++) {
                                for (int j = 0; j < w; j++) {
                                        int len = (int)(Math.log10(map[i][j])+1); //각 인자의 자릿수 구하기
                                        for (int k = 0; k < blank-len; k++) {
                                                System.out.print(" ");
                                        }
                                        System.out.print(map[i][j]+" ");
                                }
                                System.out.println();
                        }
                }
}

