package basicCoding_Programmers.stringAndIntegerCompare;

public class Answer {
    public int solution(int a, int b){
        int answer = 0;
        /**
         * //String.valueOf 대신 인트->스트링 하는 경우에는 숫자+"" 써도 됨!
         */
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;
        return answer;
    }
}
