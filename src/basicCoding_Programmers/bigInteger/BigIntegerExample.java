package basicCoding_Programmers.bigInteger;

import java.math.BigInteger;
//���ڿ��� ���� a,b�� ���� ���� ���ڿ��� ��������
//ū ���� ���� ����� BigInteger ���
public class BigIntegerExample {

        public String solution(String a, String b) {
            String answer = "";
            BigInteger c = new BigInteger(a);
            BigInteger d = new BigInteger(b);
            BigInteger sum = c.add(d);
            return sum.toString();
        }

}
