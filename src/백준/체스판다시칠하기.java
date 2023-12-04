package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1018
public class 체스판다시칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        String[][] board = new String[n][m];

        for(int i = 0; i<n; i++) {
            String lines = br.readLine();
            for(int j = 0; j<m; j++) {
                if (lines.charAt(j) == 'W') {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }

            }
        }

        int min = 0;

        List<Integer> answer = new ArrayList<>();
        for (int k = 0; k<Math.max(n,m)-8; k++){
            int cnt = 0;
            for (int i =k; i<k+3; i+=2){
                for (int j = 0 ; j<7;  j++){
                    if(!board[i][j].equals(board[i][j+1])) {
                        cnt++;
                    }
                    if(!board[i+1][j].equals(board[i+1][j+1])
                            && !board[i+1][j].equals(board[i][j])){
                        cnt++;
                    }
                }
            }
            answer.add(cnt);
        }
        Collections.sort(answer, Collections.reverseOrder());
        min = 56-answer.get(0);
        System.out.println(min);
    }
}
