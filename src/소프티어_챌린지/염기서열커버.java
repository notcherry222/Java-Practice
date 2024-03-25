package 소프티어_챌린지;

import java.io.*;
import java.util.*;
public class 염기서열커버 {
    static int n,m, answer;
    static String map[];
    static String stand;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //좋은 염기서열
        m = Integer.parseInt(st.nextToken()); //모든 좋은 염기서열 길이
        answer = 0;
        map = new String[n];
        boolean v[] = new boolean[n];
        int a[] = new int[n];
        for(int i = 0; i<n;i++) {
             map[i]= br.readLine();
        }

        for(int i = 0; i<n;i++) {
            if(!v[i]) {
                stand = map[i];
                v[i] = true;
                a[i]++;
            }
            for(int j = i+1 ;j<n;j++) {
                for(int k=0;k<m;k++) {
                    char s = stand.charAt(k);
                    char ap =  map[j].charAt(k);
                    if (s != ap){
                        v[j] = false;
                        if(s=='.'||ap=='.') {
                            v[j] = true;
                        }
                    }
                    if(s==ap) {
                        v[j] = true;
                    }
                }
            }

        }

        for(int i = 0; i<n ;i++) {
            if(a[i] != 0) answer++;
        }
        System.out.println(answer);
    }
}