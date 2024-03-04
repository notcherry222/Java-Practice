package 백준.골드.그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 백준 1707
 */
public class 이분_그래프_판별하기 {
    static ArrayList<Integer>[] a;
    static int[] check; //같은 집합인지 체크
    static boolean[] visited;
    static boolean IsEven;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int t= 0;t<testCase;t++) {
            String[] s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int e = Integer.parseInt(s[1]);
            a = new ArrayList[v+1];
            visited = new boolean[v+1];
            check = new int[v+1];
            IsEven = true;
            for(int i = 1; i<=v; i++) {
                a[i] = new ArrayList<Integer>();
            }

            //에지 데이터 저장
            for (int i = 0;i<e; i++ ){
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                a[start].add(end);
                a[end].add(start);
            }

            //모든 노드에서 DFS실행
            for (int i = 1; i<=v; i++) {
                if (IsEven) {
                    DFS(i);
                }else {
                    break;
                }
                if (IsEven) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
    private static void DFS(int start) {
        visited[start] = true;
        for (int i : a[start]) { //start에서 연결된 모든 노드 탐색
            if (!visited[start]){
                //바로 직전 노드와 다른 집합으로 분류 해주는 것이 필요
                check[i] = (check[start] + 1) %2; //1,0으로 분류
                DFS(i);
            } else {
                if (check[start] == check[i]){
                    IsEven = false;
                }
            }
        }
    }
}
