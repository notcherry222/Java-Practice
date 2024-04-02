package 백준.실버.탐색;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 감소하는_수 {
    static int n;
    static ArrayList<Long> a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new ArrayList<>();

        if(n>1022) {
            System.out.println("-1");
        } else {
            for(int i =0; i<10;i++) {
                dfs(i,1);
            }
            Collections.sort(a);
            System.out.println(a.get(n));
        }
    }
    static void dfs(long num, int idx){
        if(idx>10) return;
        a.add(num);
        for(int i=0; i<num%10;i++) {
            dfs(num *10 +i,idx+1);
        }
    }
}
