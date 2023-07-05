package basicCoding_Programmers.ascci;

import java.util.Scanner;

public class ReverseAscii {
    public static void main(String[] args) {
/**
 * int<->char 해주기 번거로움
 */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0 ; i < a.length(); i++){

            char alpha = a.charAt(i);
            int num = (int)alpha;
            if(97 <= num){
                num = num - 32;
                System.out.printf(String.valueOf((char)num));

            }else{
                num = num + 32;
                System.out.printf(String.valueOf((char)num));
            }
        }


    }
}
