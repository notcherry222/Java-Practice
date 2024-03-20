package 백준.골드.탐색;

import java.io.*;
import java.util.*;

/**
 * 3:12
 */
public class 트리 {
    static boolean v[];
    static ArrayList<Integer>[] a;
    static int delete,ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        v = new boolean[n];
        a = new ArrayList[n];
        for(int i =0; i<n ;i++) {
            a[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums[] = new int[n];
        for(int i =0;i<n;i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        delete = Integer.parseInt(br.readLine());
        int root = -1;
        for(int i = 0; i<n;i++) {
            if(nums[i] == -1) {
                root = i;
            } else {
                a[nums[i]].add(i);
                a[i].add(nums[i]);
            }
        }

        if(delete == root) {
            System.out.println(0);
            return;
        } else{
            dfs(root);
            System.out.println(ans);
        }

    }
    static void dfs(int i) {
        int count = 0; //자식 노드
        v[i] = true;
        for(int cur : a[i]){
            if(cur!= delete && !v[cur]) {
                count++;
                dfs(cur);
            }
        }
        if(count==0) {
            ans++; //자식노드가 없다면 리프 노드임.
        }
    }
}
