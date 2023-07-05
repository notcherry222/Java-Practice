package D2;

import java.util.Scanner;

public class SnailNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int dy[] = {0,1,0,-1};
        int dx[] = {1,0,-1,0};

        int arr[] = new int[t];
        for (int l = 0; l<t;l++ ){
        arr[l] = sc.nextInt();}

        for (int l = 0; l< arr.length; l++){

                int x=0,y=0,dr =0;
                int arrs[][] = new int[arr[l]][arr[l]];
                for (int cnt = 1; cnt <=arr[l]*arr[l]; cnt++){
                    arrs[x][y] = cnt;
                if (x+dx[dr] == arr[l] || y+dy[dr]==arr[l] ||x+dx[dr]<0 || y+dy[dr]<0 || arrs[x+dx[dr]][y+dy[dr]]!=0) {
                    dr++;
                    if(dr==4)
                        dr=0;
                }
                x+=dx[dr];
                y+=dy[dr];
            }

            System.out.printf("#%d\n",arr[l]);

            for (int k = 0; k < arr[l]; k++)
            {
                for (int q = 0; q < arr[l]; q++){
                    System.out.printf("%d ",arrs[q][k]);}
                System.out.println();
            }
        }
    }
}


