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
        int answer = 0;

        for(int i = 0; i<3; i++) {
           start[i] = Integer.parseInt(first[i]);
           end[i] = Integer.parseInt(second[i]);
        }
        //같은 해인지? -> 맞다면? 월/일 계산
        //           -> 아니라면? 윤월인지? -> 맞다면? 366-start
        //                               -> 아니라면? 365-start
        //마지막해는 그냥 +하기

        if(start[0] == end[0]) {

        } else {
            if(start[0] % 4 ==0 || start[0] % 400 == 0) {

            } else{

            }
        }
    }
}
