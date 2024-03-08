package 백준.실버.순열과_조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//4:9
public class 순열_15649 {
    static int n,m;
    static int[] arr;
    static boolean[] visited; //중복 탐색
    static StringBuilder answer = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr= new int[m];
        visited = new boolean[n];
        dfs(0);
        System.out.println(answer);
    }

    public static void dfs(int depth) {
        if(depth == m) {
                for (int i = 0; i < m; i++) {
                    answer.append(arr[i]).append(' ');
                }
                answer.append('\n');
                return;
        }

        for (int i = 0; i<n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i +1;
                dfs(depth + 1);
                visited[i] =false;
            }
        }
    }
}
