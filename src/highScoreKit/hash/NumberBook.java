package highScoreKit.hash;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NumberBook {
    public boolean solution(String[] phone_book) {

        HashSet<String> s = new HashSet<>();

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
