import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int n1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int n2 = nums[j];
                if (n1 + n2 == target) {


                    return new int[]{i, j};
                }
            }
        }return answer;
    }
    public boolean isPalindrome(int x) {
        int n =0;
        if(x<0) {return false;}
        else{
            while(x!=0){

                n = x%10 + n*10;
                x/=10;
            }if(x == n){return true;}

        }
        return false;
    }
}