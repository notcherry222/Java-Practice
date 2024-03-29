package highScoreKit.정렬;

import java.util.Scanner;

public class 삼각_달팽이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int answer[] = new int[(n+1)*n/2];
        int temp[][] = new int[n][n];
        int x = -1;
        int y = 0;
        int num =1;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                if(i%3==0) {
                    x++;
                }else if((i%3)==1) {
                    y++;
                } else {
                    x--;
                    y--;
                }
                temp[x][y] = num;
                num++;
            }
        }
        int dx= 0;

        for(int i =0; i<n;i++) {
            for(int j = 0; j<n;j++) {
                if(temp[i][j] ==0) break;
                answer[dx] = temp[i][j];
                dx++;
            }
        }

        for(int i =0; i<n*(n+1)/2; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
