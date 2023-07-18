package basicCoding_Programmers.bigInteger;

import java.math.BigInteger;
//문자열로 받은 a,b를 더한 값을 문자열로 내보내기
//큰 수일 때를 대비해 BigInteger 사용
public class BigIntegerExample {

        public String solution(String a, String b) {
            String answer = "";
            BigInteger c = new BigInteger(a);
            BigInteger d = new BigInteger(b);
            BigInteger sum = c.add(d);
            return sum.toString();
        }

}
