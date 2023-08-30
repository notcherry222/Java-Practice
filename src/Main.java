import java.util.ArrayList;
import java.util.Arrays;

public class Main {
        public int[] solution(int[] array, int[][] commands) {

            
            int[] answer = new int[commands.length];

            for(int i =0 ; i< commands.length; i++){
                int[] a = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] - 1);
                 Arrays.sort(a);
                answer[i] = a[commands[i][2]];
            }
            return answer;

    }
}