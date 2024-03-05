package 백준.골드.그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1717
 * 유니온 파인드
 */
public class 집합표현하기 {
    static int parent[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parent = new int[n+1]; //0안 사용
        //대표 노드 초기화
        for (int i = 0; i<n+1; i++) {
            parent[i] = i;
        }

        //질의 계산
        for (int i =0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int question = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (question == 0) {
                union(a, b);
            } else {
                boolean result = checkSame(a,b);
                if(result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static void union(int a, int b) {
        //대표 노드 찾아서 연결하기
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
    }

    private static int find(int a) {
        if (a == parent[a]) { //대표 노드인 경우
            return a;
        } else {
            return parent[a] = find(parent[a]); //value를 index로 바꿔서 다시 대표 노드 찾아보기
        }
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if(a==b) return true;
        return false;
    }
}
