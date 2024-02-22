package 소프티어_챌린지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 지도자동구축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int stage = (int) Math.pow(2, num-1)*2+1;
        System.out.println(stage * stage);
    }
}
