package highScoreKit.hash;

import java.util.SortedSet;
import java.util.TreeSet;

public class NumberBook {
    public boolean solution(String[] phone_book) {

        SortedSet<String> s = new TreeSet<>();

        for(String num : phone_book){
            for(String str : s) {
                if (num.startsWith(str) || str.startsWith(num)) {
                    return false;
                }
                s.add(num);
            }
        }
        return true;
    }
}
