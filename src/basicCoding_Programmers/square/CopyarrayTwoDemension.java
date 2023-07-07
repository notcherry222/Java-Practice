package basicCoding_Programmers.square;

public class CopyarrayTwoDemension {
    public int[][] solution(int[][] arr) {
        int i = arr.length;
        int j = arr[0].length;
        int maxLength = Math.max(i,j);
        int [][] answer= new int[maxLength][maxLength];

        for(int k = 0 ; k<i ; k++){
            System.arraycopy(arr[k],0,answer[k],0,j);
        }
        return answer;
    }
}
