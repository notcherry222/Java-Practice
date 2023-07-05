package D1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //1~9
        //사칙연산 순서로 연산결과 출력 쁠마곱나누기
        //나누기에서 소수점 버리기

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b); //절대값 math.abs()
        System.out.println(a*b);
        System.out.println(a/b);

    }
}
