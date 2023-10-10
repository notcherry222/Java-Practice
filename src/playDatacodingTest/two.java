import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 100미만의 모든 양의 정수는 자르기 과정을 반복해서 적용하면 원래 숫자로 돌아오는 특징을 가지고 있다.
 * 자르기 과정은 아래와 같다.
 * 1. 현재 정수 A를 자른다. 어떤 수를 자르게 되면 십의 자리 숫자와 일의 자리 숫자로 나뉘게 된다.
 * 2. A의 십의 자리 숫자와 일의 자리 숫자를 더한 값을 B라고 하자. B를 잘라서 십의 자리 숫자와 일의 자리 숫자로 나눈다.
 * 3. 새로운 정수 C는 A의 일의 자리 숫자를 십의 자리로 하고, B의 일의 자리 숫자를 일의 자리로 하는 수이다.
 * 4. 현재 정수 A는 C가 되고, 한 번의 자르기 과정이 종료된다. 어떤 수 이 주어졌을 때, 몇 번의 자르기 과정을 거치면 으로 다시 되돌아가는지 구하시오. 입력 범위에 해당하는 모든 수에 대해, 원래의 수로 자르기 과정을 거쳐 되돌아갈 수 있음을 증명할 수 있다.
 *
 * 2
 * 1
 * 5
 *
 * 60
 * 3
 */

public class two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 입력값

            int original = n; // 원래의 수를 저장해둡니다.
            int cnt = 0; // 자르기 과정 카운트 변수

            do {
                int x = n / 10; // 십의 자리 숫자
                int y = n % 10; // 일의 자리 숫자
                int sum = x + y; // 더한 값

                n = (y * 10) + (sum % 10); // 새로운 정수 계산

                cnt++; // 자르기 과정 횟수 증가
            } while (n != original); // 원래의 수로 돌아올 때까지 반복

            System.out.println(cnt);
        }
    }
}
