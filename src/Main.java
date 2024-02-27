import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /**
     * 첫번째 줄: 개수 N(십만 이하), 합을 구해야 하는 횟수 M(십만 이하)
     * 두번째 줄: N개의 수
     * 세번째 줄: 합을 구해야 하는 구간
     * 시간 제한: 0.5초
     *
     * 문제 풀이 방식
     * S[n] = S[n-1] + A[n] 이용!
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] S = new long[N+1];
        st = new StringTokenizer(br.readLine());

        for(int i =1; i<=N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int q=0; q<M; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] -S[i-1]);
        }
    }
}