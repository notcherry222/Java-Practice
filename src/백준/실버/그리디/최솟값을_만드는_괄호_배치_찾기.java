package 백준.실버.그리디;

import java.util.Scanner;

public class 최솟값을_만드는_괄호_배치_찾기 {
    static int answer= 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] str = example.split("-");
        for (int i = 0; i<str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) answer = answer + temp;
            else answer = answer - temp;
        }
        System.out.println(answer);
    }

    private static int mySum(String a) {
        int sum = 0;
        String[] temp = a.split("[+]"); //허상 수량자 에러 해결 -> 대괄호 사용 / split이 +를 잘 인식 못 함..
        for (int i = 0; i<temp.length; i++) {
            sum = sum + Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
