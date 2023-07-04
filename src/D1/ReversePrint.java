package D1;

import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();

        for(int i = t; i>=0; i--){
            System.out.printf(i + " ");
        }
    }
}
