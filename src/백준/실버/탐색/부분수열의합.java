package 백준.실버.탐색;

import java.util.*;
import java.io.*;
public class 부분수열의합 {
    static int n,s,answer;
    static int arr[];
    static boolean v[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        n = Integer.parseInt(sc.nextToken());
        s = Integer.parseInt(sc.nextToken());
        arr = new int[n];
        v = new boolean[n];
        String line[] = br.readLine().split(" ");
        for(int i =0; i<n ;i++){
            arr[i] = Integer.parseInt(line[i]);
        }
        answer = 0;
        dfs(0,0);
        System.out.println(s == 0? answer-1: answer); //아무것도 안 뽑는 경우(dfs 두번째 꺼)도 s=0인경우에 들어가므로
    }
    static void dfs(int depth, int sum) {
        if(depth==n) {
            if (sum == s) {
                answer++;

            }
            return;
        }
        dfs(depth+1, sum+arr[depth]);//원소 선택 o
        dfs(depth+1, sum); //원소 선택 x

    }
}
