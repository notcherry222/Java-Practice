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
        for(int i =0 ; i<w.length; i++){
            m1 = max(m1, w[i]);
            m2 = max(m2, l[i]);
        }

        /** 이해 안 감
         *   int length = 0, height = 0;
         *         for (int[] card : sizes) {
         *             length = Math.max(length, Math.max(card[0], card[1]));
         *             height = Math.max(height, Math.min(card[0], card[1]));
         *         }
         *         int answer = length * height;
         */
        return m1*m2;
    }
}
