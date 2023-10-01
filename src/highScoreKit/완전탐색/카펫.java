package highScoreKit.완전탐색;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int inTile = yellow;
        return find(inTile, sum);
    }
    private static int[] find(int inTile, int sum){
            //y=세로, x=가로
            int y = 0, x=0;

            for(int i =1; i<=inTile ; i++){
                if(inTile%i == 0){
                    y = Math.min(i, inTile/i);
                    x = Math.max(i, inTile/i);
                    if( ((y+2)*(x+2))==sum){
                        break;
                    }
                }
            } return new int[] {x+2, y+2};
    }

}
