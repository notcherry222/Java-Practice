package highScoreKit.hash;

import java.util.Arrays;
import java.util.HashSet;
public class NumberBook {
    public boolean solution(String[] phone_book) {

        HashSet<String> s = new HashSet<>(Arrays.asList(phone_book));

        for(String num : phone_book){
            for(int i =0; i<num.length();i++) {
                if (s.contains(num.substring(0,i))) {
                    return false;
                }
                s.add(num);
            }
        }
        return true;
    }
}
