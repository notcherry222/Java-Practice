package 백준.골드.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 1011
 * 5:25
 */
public class FlyMeToTheAlphaCentauri {
    static int start,end,jump,count;
    static int dx[] = {-1,0,1};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);;
        int t = sc.nextInt();
        for(int i = 0;i<t;i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            count =Integer.MAX_VALUE;
            dfs(start,0,0);
            System.out.println(count);
        }

    }
    static void dfs(int start, int jumping,int depth) {
        if(start == end) {
            count = Math.min(depth,count);
            return;
        }
        for(int i = 0; i<3;i++) {
            int next = start+dx[i]+jumping;
            if(next>0 && next!=start) {
                jumping+=Math.abs(dx[i]);
                dfs(next,jumping,depth+1);
            }
        }
    }
}
