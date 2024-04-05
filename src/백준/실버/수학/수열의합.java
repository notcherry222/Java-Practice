package 백준.실버.수학;

/**
 * 1024
 * 2:9
 * 1 2 3 4 5 6 7 8
 * 1 3 5 9 14 20
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 수열의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        boolean isPossible = false;
        List<Integer> answer = new ArrayList<>();
        for(int i=l;i<101;i++){
            long start = n/i -(i-1)/2;
            if (start >= 0) {
                    if (n == (start * 2 + i - 1) * i/2) {
                        isPossible = true;
                        for (int k = 0; k < i; k++) {
                            answer.add((int) (start + k));
                        }
                        break;
                    }
                }

        }

        if(isPossible == false ){
            System.out.println(-1);
        }else{
            for(int i = 0; i<answer.size();i++) {
                System.out.print(answer.get(i)+" ");
            }
        }
    }
}
