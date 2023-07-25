import java.util.*;

class Pocketmon {
    public int solution(int[] nums) {
        int answer = 0;

        HashMap<Integer, Integer> n = new HashMap<>();
        for(Integer num : nums ){
            n.put(num, n.getOrDefault(num,0)+1);
        }
        answer = Math.min(n.size(), nums.length / 2);
        return answer;
    }
}