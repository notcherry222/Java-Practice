package basicCoding_Programmers.handlingCode;

public class HandlingCode {
    public String solution(String code) {

        int mode= 0;
        String answer = "";
        int i = 0;

        while(i < code.length()) {
            if(code.charAt(i) == '1'){
                mode = (mode == 1)? 0 : 1;
            }
            else if(mode == 0){
                if(i % 2 ==0){
                    answer += code.charAt(i);
                }else{
                    answer += "";}
            }
            else if(mode == 1){
                if(i%2 == 1){
                    answer += code.charAt(i);
                }else{
                    answer += "";}
            }i++;
        }return answer.isEmpty() ? "EMPTY" :  answer;
    }
}

