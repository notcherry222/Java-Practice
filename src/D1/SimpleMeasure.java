package D1;

import java.util.Scanner;

public class SimpleMeasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1 ; i<=N ; i++){
            if (N%i == 0){
                System.out.printf(i+ " ");
            }
        }
    }
}
