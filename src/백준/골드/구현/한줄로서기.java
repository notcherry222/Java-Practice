package 백준.골드.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//4:52
public class 한줄로서기 {
    static int n;
    static int p[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n  = Integer.parseInt(st.nextToken());
        p = new int[n];
        int[] answer = new int[n];
        String command[] = br.readLine().split(" ");
        for(int i = 0; i<n; i++) {
            p[i] = Integer.parseInt(command[i]);
        }

        for(int i = n-1, j = 0; i>=0; i--, j++){
            int count = p[i];
            if(count == j){
                answer[j] = i+1;
            } else {
                for(int k = j; k>count; k--) {
                    answer[k] = answer[k-1];
                }
                answer[count] = i+1;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(answer[i] +" ");
        }

    }
}
