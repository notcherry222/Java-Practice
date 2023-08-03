package highScoreKit.hash;

import java.util.HashMap;

public class UnfinishedPlayer {
        public String solution(String[] participant, String[] completion) {

            String answer = "";
            HashMap<String, Integer> map = new HashMap<>();

            for(String str : participant ){
                map.put(str, map.getOrDefault(str,0)+1);
            }
            for(String str : completion){
                map.put(str, map.get(str)-1);
            }

            return answer;
        }
}
