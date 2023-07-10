package basicCoding_Programmers.query;


import java.util.Arrays;


public class SectionQuery2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] answer = new int[queries.length];

        //queries.length만큼 돌음
        for (int i = 0; i < queries.length; i++) {

            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            //가장 작은 수 그리고 queries[0][2]보다는 큰 수
            for (int j = s; j < e; j++) {
                answer[i] = (arr[j] <= arr[j + 1]) ? arr[j] : arr[j + 1];
                answer[i] = (answer[i] > k) ? answer[i] : k;
            }
        }  System.out.println(Arrays.toString(answer));
    }


}

