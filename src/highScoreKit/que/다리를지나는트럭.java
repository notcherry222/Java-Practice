package highScoreKit.que;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;

        Queue<Integer> bridge = new LinkedList<>();

        for(int i =0; i<bridge_length-1;i++){
            bridge.offer(0);
        }
        int currentWeights = truck_weights[0];
        bridge.offer(currentWeights);

        int index = 1;

        while(!bridge.isEmpty()){
            answer++;
            int truck = bridge.poll();
            currentWeights -= truck;

           if(index < truck_weights.length){
               if(currentWeights + truck_weights[index] <= weight){
                   currentWeights += truck_weights[index];
                   bridge.add(truck_weights[index++]);
               }else{
                   bridge.offer(0);
               }
           }
        }
        return answer;
    }
}
