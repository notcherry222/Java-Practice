import java.util.ArrayList;
import java.util.Collections;

public class Main {
        public String[] solution(String myString) {

            StringBuilder ans = new StringBuilder();
            ArrayList<String> answerl = new ArrayList<>();

            for(char str : myString.toCharArray()){
                if(str !='x'){
                    ans.append(str);
                }else
                {
                    if(ans.length()>0){
                        answerl.add(ans.toString());
                        ans.setLength(0);}}
            }

            if(ans.length()>0){ answerl.add(ans.toString());}

            Collections.sort(answerl);
            String[] answer = new String[answerl.size()];
            for(int i =0 ; i< answerl.size();i++){
                answer[i] = answerl.get(i);
            }

            return answer;

    }
}