package basicCoding_Programmers.query;

import java.util.Arrays;

public class ThirdQuery {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        for(int i = 0 ; i<queries.length; i++){

                int f = queries[i][0];
                int e = queries[i][1];
                arr[f] = arr[e];
                arr[e] = arr[f];
        }

        System.out.println(Arrays.toString(arr));
    }

}
