package highScoreKit.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 가장큰수 {
    public String solution(int[] numbers) {
        // int를 문자열로 변환하여 비교하기 위한 Comparator를 사용한 정렬
        List<String> numberStrings = new ArrayList<>();
        for (int number : numbers) {
            numberStrings.add(Integer.toString(number));
        }

        // 정렬 기준: 두 숫자를 합쳤을 때 더 큰 결과가 나오는 순서로 정렬
        Collections.sort(numberStrings, (a, b) -> (b + a).compareTo(a + b));

        // 정렬된 문자열을 이어붙여서 가장 큰 수를 만듦
        StringBuilder answer = new StringBuilder();
        for (String str : numberStrings) {
            answer.append(str);
        }

        // 예외 처리: numbers가 모두 0으로 이루어져 있는 경우
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}
