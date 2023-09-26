package highScoreKit.완전탐색;

import java.lang.reflect.Array;


public class 카펫 {
    public int[] solution(int brown, int yellow) {
        //갈색 + 노란색
        int total = brown+yellow;
        //가로길이:a >=세로 길이:b
        int b =1;
        int a =1;
        int j = 0;

        int[] arr = new int[total];

        for(int i = 0; i<=total/2+1 ; i++) {
            if(total%b==0){
                a = total/b;
                arr[j] = a;
                j++;
                arr[j] = b;
                j++;
            }
        }

        return arr;
    }
}
