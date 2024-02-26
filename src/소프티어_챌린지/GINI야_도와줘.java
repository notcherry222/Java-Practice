package 소프티어_챌린지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GINI야_도와줘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        int l1 = Integer.parseInt(first[0]);
        int l2 = Integer.parseInt(first[1]);
        String[][] map = new String[l2][l1];

        for(int i = 0; i<l2; i++) {
            map[i] = br.readLine().split("");
        }

        int count = 0;

        
    }
}
