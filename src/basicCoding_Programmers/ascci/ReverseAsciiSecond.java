package basicCoding_Programmers.ascci;

import java.util.Scanner;

public class ReverseAsciiSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (Character c : a.toCharArray()){ //toCharArray : string을 char로 배열
            if (Character.isUpperCase(c)){
                answer += Character.toLowerCase(c); //toLowerCase : parameter 없고, return : 소문자로 변환
            }else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}
