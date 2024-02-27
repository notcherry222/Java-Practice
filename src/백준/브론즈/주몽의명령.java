package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의명령 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        //1. a[n]에 오름차순으로 정렬
        Arrays.sort(A);

        int i = 0; //A[0] -> min
        int j = N-1; //A[N-1] -> max
        
        //2. min(맨 왼쪽)과 max(맨 오른쪽)를 더해보며 반복
        while(i<j) {
            if(A[i]+A[j] < M) i++;
            else if (A[i]+A[j] > M) {
                j--;
            } else{
                count++;
                i++; j--;
            }
        }
        System.out.println(count);
    }
}
