package 백준.실버.순열과_조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 순열_15654 {
    static int n,m;
    static boolean[] visited;
    static int[] arr;
    static int[] inputs;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr= new int[m];
        visited = new boolean[n];
        inputs = new int[n];
        String[] a = br.readLine().split(" ");
        for(int i = 0; i<n;i++) {
            inputs[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(inputs);
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == m) {
            for(int i = 0; i<m;i++) {
                sb.append(arr[i]);
                sb.append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i<n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = inputs[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
