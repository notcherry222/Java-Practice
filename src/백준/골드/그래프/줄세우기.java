package 백준.골드.그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 2252
 * 위상 정렬 -> 답이 여러개 나올 수 있음
 */
public class 줄세우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> a = new ArrayList<>(); //인접 리스트
        for (int i = 0; i<n; i++) {
            a.add(new ArrayList<>());
        }
        int indegree[] = new int[n+1];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<m;i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            a.get(s).add(e);
            indegree[e] ++; //진입차수 배열 데이터 저장
        }

        //위상 정렬 실행
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i<=n; i++) {
            if (indegree[i] == 0 ){
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");
            for (int next: a.get(now)) {
                indegree[next]--;
                if (indegree[next] ==0 ){
                    queue.offer(next);
                }
            }
        }
    }
}
