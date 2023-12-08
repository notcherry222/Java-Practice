package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1009
public class 분산처리 {
    // 컴퓨터 번호 % 10 번호를 가짐
    // 총 데이터의 개수는 a의 b제곱
    // 마지막 데이터가 처리될 컴퓨터의 번호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++) {
            String lines[] = br.readLine().split(" ");
            int a = Integer.parseInt(lines[0]); //a
            int b = Integer.parseInt(lines[1]); //b
            int data = 1;

            for(int j = 0; j<b; j++) {
                data = (data * a) % 10;
            }
            if(data == 0 ) {
                data =  10;
            }

            System.out.println(data);
        }

    }

}
//7931