package D1;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        //가위 1 , 바위 2, 보 3
        /**
         * 1 3
         * 2 1
         * 3 2
         */
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        //A가 숫자가 클 경우
        if(A>B && A-B == 1){
            System.out.println("A");
        }
        //A가 숫자가 작을 경우
        else {
            if(B-A == 2) {
                System.out.println("A");}
            else{
                System.out.println("B");
            }
        }

//        //A가 가위일 경우
//        if (A==1){
//            if ((B-A) == 2 ){
//                System.out.println("A");
//            }else {
//                System.out.println("B");
//            }
//        }
//        //A가 바위일 경우
//        else if (A == 2){
//            if ((A-B) == 1 ){
//                System.out.println("A");
//            }else {
//                System.out.println("B");
//            }
//        }
//
//        //그 외
//        else {
//            if (A-B == 1){
//                System.out.println("A");
//            }
//            else {System.out.println("B");}
//        }
    }
}
