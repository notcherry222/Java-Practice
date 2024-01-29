package 소프티어_챌린지;
import java.io.*;
import java.util.*;
public class 금고털이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //w까지 담을 수 있다. n종류
        String[] input = br.readLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        ArrayList<int[]> gold = new ArrayList<>();
        long answer = 0;

        //입력값을 배열로 받아 리스트 생성
        for (int i =0; i<n;i++) {
            String[] command = br.readLine().split(" ");
            gold.add(new int[] {Integer.parseInt(command[0]), Integer.parseInt(command[1])});
        }

        Collections.sort(gold, (o1, o2) -> o2[1]-o1[1]);

        for(int[] item:gold) {
            if (w <= 0) {
                answer += w*item[1];
                System.out.println(answer);
                break;
            } else {
                answer += item[0] * item[1];
                w-=item[0];
            }
        }

    }
}
