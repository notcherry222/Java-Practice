package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1308
public class D_DAY {
    public static void main(String[] args) throws IOException {
        //4, 400으로 나뉘어지는 수 -> 윤년
        // y+1000 -> gg 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] start = new int[3];
        int[] end = new int[3];
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        for(int i = 0; i<3; i++) {
           start[i] = Integer.parseInt(first[i]);
           end[i] = Integer.parseInt(second[i]);
        }

        if((start[0] + 1000) >= end[0]) {
            if(end[1] > start[1]) {
                System.out.println("gg");
            } else if(start[1] == end[1] && start[2] < end[2]) {
                System.out.println("gg");
            }
        } else {
           int y = end[0] - start[0];

        }
    }
}
