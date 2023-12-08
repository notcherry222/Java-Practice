package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다리놓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++) {
            String[] lines = br.readLine().split(" ");
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[1]);

            int answer = 1;

            for(int j = 0; j<a; j++) {
                answer = answer*(b-j)/(a-j);
            }

            System.out.println(answer);

        }
    }
}
