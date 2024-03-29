package highScoreKit.DFS_BFS;

import java.io.*;
import java.util.*;

public class 전력망_둘로_나누기 {
    static int n;
    static ArrayList<Integer>[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int answer = Integer.MAX_VALUE;
        a=new ArrayList[n];
        for(int i = 0; i<n; i++) {
            a[i] = new ArrayList<>();
        }
        int wires[][] = new int[n][2];
        for(int i = 0; i< testCase ; i++ ){
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) -1;
            int end = Integer.parseInt(st.nextToken()) -1;
            a[start].add(end);
            a[end].add(start);
            wires[i][0] = start;
            wires[i][1]= end;
        }

        for(int i = 0; i<wires.length; i++) {
            int start = wires[i][0];
            int end = wires[i][1];

            boolean v[] = new boolean[n];
            a[start].remove(Integer.valueOf(end));
            a[end].remove(Integer.valueOf(start));
            int cnt = dfs(1, v, 0);

            int temp = Math.abs(cnt - (n-cnt));
            answer = Math.min(temp, answer);

            a[start].add(end);
            a[end].add(start);
        }

    }
    public static int dfs(int num, boolean[] v, int depth) {
        v[num] = true;

        for(int next : a[num]) {
            if(!v[next]) {
                dfs(next,v, depth+1);
            }
        }
        return depth;
    }
}
