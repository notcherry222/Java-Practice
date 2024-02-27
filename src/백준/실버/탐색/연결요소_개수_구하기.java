package 백준.실버.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * DFS 깊이탐색
 * 백준 11724
 */
public class 연결요소_개수_구하기 {
    static boolean visited[];
    static ArrayList<Integer>[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //노드 개수
        int m = Integer.parseInt(st.nextToken()); //에지의 개수
        int result = 0;
        //방문 리스트
        visited = new boolean[n+1]; // 0번 인덱스는 헷갈리니 사용 안 하겠음!
        //인접 리스트
        a = new ArrayList[n+1];
        for (int i = 1; i<n+1; i++) {
            a[i] = new ArrayList<Integer>(); // 인접 리스트만큼 연결된 노드를 넣을 리스트
        }
        for (int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int start =  Integer.parseInt(st.nextToken());
            int end =  Integer.parseInt(st.nextToken());
            //방향성이 없기 때문에.
            a[start].add(end);
            a[end].add(start);
        }

        for (int i = 1; i<n+1; i++) {
            if(!visited[i]) {
                result++;
                DFS(i);
            }
        }

        System.out.println(result);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i :a[v]) {
            if (!visited[i]) {
                DFS(i); // 재귀함수
            }
        }
    }
}
