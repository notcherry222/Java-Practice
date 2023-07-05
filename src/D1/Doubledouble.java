package D1;

import java.util.Scanner;

public class Doubledouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i =0; i<=t ; i++){
            System.out.printf((int) Math.pow(2,i)+" ");
            /**
             * math.pow -> double 값
             * (int) 타입 변환 ! String에선 "정수인 string만 가능"
             * 강제 변환 = 의도한 변환
             *
             * parseInt  참조 타입 변환 -> int로 기본 자료형 리턴
             * valueOf  참조 타입 변환 -> 문자열로 , new Integer 로 객체가 리턴
             */
        }

        char[] arr = {'h','e','l','l','o'};
        String str = String.valueOf(arr);
        System.out.println(str);
    }
}
