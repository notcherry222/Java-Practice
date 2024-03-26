package 백준.골드.탐색;

import java.io.*;
import java.util.*;

/**
 * 12:05
 * dfs사용
 */
public class 교환 {
    static int k,m;
    static int memo[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        k = Integer.parseInt(st.nextToken());
        m = n.length();
        memo = new int[k+1][1000001];
        System.out.println(dfs(n,0));
    }
    static int dfs(String strN, int depth) {
        int n = Integer.parseInt(strN);
        if(depth == k) {
            return n;
        }

        int memoValue = memo[depth][n];
        if(memoValue != 0) {
            return memoValue;
        }

        memoValue = -1;
        for(int i = 0; i<m-1;i++) {
            for(int j = i+1; j<m;j++) {
                if(i == 0 && strN.charAt(j) == '0') {
                    continue; // 첫번째 자리가 0이라면 넘어감
                }
                String swapStr=swap(strN, i,j);

                int temp =dfs(swapStr, depth+1);
                memoValue = Math.max(memoValue, temp);
            }
        }
        memo[depth][n] = memoValue;
        return memo[depth][n];
    }

    private static String swap(String s, int i, int j) {
        char arr[] = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
