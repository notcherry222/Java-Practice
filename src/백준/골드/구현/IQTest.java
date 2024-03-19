package 백준.골드.구현;

import java.io.*;
import java.util.*;

/**
 * 1111
 * 1:20-2:10 + 디버그 사용
 */
public class IQTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line[] = br.readLine().split(" ");
        int nums[] = new int[n];
        for(int i =0; i<n; i++) {
            nums[i] =  Integer.parseInt(line[i]);
        }
        while(true) {
            // 다음수가 여러개라면 a, : 배열이 두 개이하 인경우(단 배열값이 다 같은 경우 제외)
            if (n == 2 ) {
                if( nums[0] != nums[1]) {
                    System.out.println("A");
                    break;
                } else {
                    System.out.println(nums[0]);
                    break;
                }
            } else if (n == 1) {
                System.out.println("A");
                break;
            }else if (n>2 && nums[0] == nums[1]) {
                boolean check = true;
                for(int i=0; i<n; i++) {
                    if(nums[1] != nums[i]) {
                        check = false;
                    }
                }
                if(check) {
                    System.out.println(nums[0]);
                    break;
                }else {
                    System.out.println("B");
                    break;
                }

            } else {
                //a가 정수가 아닌 경우, 테케7
                if ((nums[2] - nums[1]) % (nums[1] - nums[0]) != 0) {
                    System.out.println("B");
                    break;
                }
                //다음수 출력,
                int a = (nums[2] - nums[1]) / (nums[1] - nums[0]);
                int b = nums[1]- (nums[0] * a);
                //  다음수를 구할 수 없다면 b:규칙을 구했는데 다음에서 맞지 않는다면 b
                boolean check =true;
                for(int i = 2; i<=n-2;i++) {
                    if(nums[i+1] != a*nums[i] + b) {
                        check = false;
                    }
                }
                if (check) {
                    System.out.println(a * nums[n - 1] + b);
                    break;
                } else {
                    System.out.println("B");
                    break;
                }
            }
        }

    }
}
