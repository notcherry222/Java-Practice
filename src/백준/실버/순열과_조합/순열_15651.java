package 백준.실버.순열과_조합;

import java.util.*;
import java.io.*;

public class 순열_15651 {
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());;
        arr = new int[m];

        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int depth) {
        if(depth == m){
            for (int i = 0; i<m; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return; //재귀 호출 종료
        }
        for(int i = 1; i<=n; i++) {
            arr[depth] = i;
            dfs(depth+1);
        }
    }
}
