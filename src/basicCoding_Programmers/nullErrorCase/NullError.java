package basicCoding_Programmers.nullErrorCase;
import java.util.*;

public class NullError {
        public String[] solution(String[] strArr) {
            String[] answer = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                answer[i] = "";
            }


            for(int i = 0 ; i<strArr.length; i+=2){
                for(char ch : strArr[i].toCharArray()){
                    answer[i] += Character.toLowerCase(ch);
                }
            }
            for(int i = 1 ; i<strArr.length; i+=2){
                for(char ch : strArr[i].toCharArray()){
                    answer[i] += Character.toUpperCase(ch);
                }
            }

            return answer;
        }

}
