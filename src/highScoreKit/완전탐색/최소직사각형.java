package highScoreKit.완전탐색;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int w[] = new int[sizes.length];
        int l[] = new int[sizes.length];
        int m1 =0;
        int m2 =0;
        for(int i =0 ; i<sizes.length; i++){
            w[i] = max(sizes[i][0],sizes[i][1]);
            l[i] = min(sizes[i][0],sizes[i][1]);
        }
        for(int i =1 ; i<w.length; i++){
            if(w[i]>w[i-1]){
                m1 = w[i];
            }
            if(w[0]>m1){
                m1 = w[0];
            }
            if(l[i]>l[i-1]){
                m2 = l[i];
            }
            if(l[0]>m2){
                m2 = l[0];
            }
        }
        return m1*m2;
    }
}
