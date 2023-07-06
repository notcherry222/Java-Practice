package basicCoding_Programmers.lastTwoElements;

public class LastTwoElements {
    class Solution {
        public int[] solution(int[] num_list) {

            int last = num_list.length;
            int[] answer = new int[last + 1];

            if (num_list[last - 1] > num_list[last - 2]) {
                answer[last] = num_list[last - 1] - num_list[last - 2];
            } else {
                answer[last] = num_list[last - 1] * 2;
            }
            /**
             * 배열의 덧셈은 있을 수 없는 일!
             * int[] answer; 은 배열 선언만 했을 뿐 -> 생성은 하지 않은 상태 -> 값 삽입 불가
             */
            System.arraycopy(num_list, 0, answer, 0, last);
            return answer;
        }
    }
}