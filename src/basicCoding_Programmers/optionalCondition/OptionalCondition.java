package basicCoding_Programmers.optionalCondition;

public class OptionalCondition {
    /**
     * input : n = 시작값, control = "wsdawsdassw"
     * return : control 값에 따른 n의 연산
     */
    class Solution {
        public int solution(int n, String control) {
            for(char c : control.toCharArray()){
                n += c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10;
            }
            return n;
        }
    }
}
