package highScoreKit.hash;

import java.util.HashMap;

public class MatchingClothes {
    public int solution(String[][] clothes){
        int answer=1;
        HashMap<String, Integer> map = new HashMap<>();

        for(String[] cnt: clothes){
            String type = cnt[1];
            map.put(type, map.getOrDefault(type,0)+1);
        }
        for(int cnt : map.values()){
            answer*=(cnt+1);
        }
        return answer;
    }
}
