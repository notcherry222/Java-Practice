package highScoreKit.hash;

import java.util.*;
import java.util.stream.Collectors;

public class DontLikeSameNum {
    public int[] solution(int[] arr) {

        Set<Integer> s = Arrays.stream(arr)
                                .boxed()
                                .collect(Collectors.toSet());

//        for(int i = 0 ; i< arr.length ; i++){
//            s.add(arr[i]);
//        }
//        int[] answer = new int[s.size()];
//        for(int i =0; i<s.size(); i++){
//            answer[i] = s.

        List<Integer> l = new LinkedList<>();

        int i = -1;

        for(int num : arr){
            if(i!=num){
                l.add(num);
                i = num;
            }
        }

//        int[] answer = new int[l.size()];
//
//        for(int j = 0; j<l.size();j++){
//            answer[j] = l.get(j);
//        }

        return l.stream().mapToInt(n->n).toArray();
    }
}
