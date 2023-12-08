package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1032
public class 명령프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] inputs = new String[num];

        for(int i = 0; i<num; i++) {
            inputs[i] = br.readLine();
        }
        int[] answer = new int[inputs[0].length()];

        for (String input : inputs) {
            for (int i = 0; i < input.length(); i++) {
                if (inputs[0].charAt(i) == input.charAt(i)) {
                    answer[i] ++;
                }
            }
        }

        for (int i =0; i<answer.length; i++) {
            if (answer[i] == num) {
                System.out.print(inputs[0].charAt(i));
            } else {
                System.out.print("?");
            }
        }
    }
}
