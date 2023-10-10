import java.io.*;

/**
 * 5
 * A 3
 * B 2
 * C 2
 * A 3
 * B 2
 *
 * 3
 *
 * 6
 * A 4
 * C 5
 * C 5
 * C 5
 * C 5
 * B 9
 *
 * 5
 */

public class One {
    public static void main(String[] args) throws Exception {

        //a ->3 b->2 c->!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] arr = new int[9];
        int one=0, two =0, three=0, four=0, five=0,six=0,seven=0,eight=0,nine=0;

        for(int i = 0 ;i<input.length() ; i++) {
            if (input.contains("1")) {
                if(input.contains("A")){
                    one += 3;
                } else if(input.contains("B")){
                    one+=2;
                } else {
                    one+=1;
                }
            }
            else if(input.contains("2")){
                if(input.contains("A")){
                    two += 3;
                } else if(input.contains("B")){
                    two+=2;
                } else {
                    two+=1;
                }
            } else if(input.contains("3")){
                if(input.contains("A")){
                    three += 3;
                } else if(input.contains("B")){
                    three+=2;
                } else {
                    three+=1;
                }
            }
            else if(input.contains("4")){
                if(input.contains("A")){
                    four += 3;
                } else if(input.contains("B")){
                    four+=2;
                } else {
                    four+=1;
                }
            }else if(input.contains("5")){
                if(input.contains("A")){
                    five+= 3;
                } else if(input.contains("B")){
                    five+=2;
                } else {
                    five+=1;
                }
            }
            else if(input.contains("6")){
                if(input.contains("A")){
                    six += 3;
                } else if(input.contains("B")){
                    six+=2;
                } else {
                    six+=1;
                }
            }
            else if(input.contains("7")){
                if(input.contains("A")){
                    seven += 3;
                } else if(input.contains("B")){
                    seven+=2;
                } else {
                    seven+=1;
                }
            }
            else if(input.contains("8")){
                if(input.contains("A")){
                    eight+= 3;
                } else if(input.contains("B")){
                    eight+=2;
                } else {
                    eight+=1;
                }
            }else {
                if(input.contains("A")){
                    nine += 3;
                } else if(input.contains("B")){
                    nine+=2;
                } else {
                    nine+=1;
                }
            }
        }

        arr[0]=one;
        arr[1] = two;
        arr[2]=three;
        arr[3]=four;
        arr[4]=five;
        arr[5]=six;
        arr[6]=seven;
        arr[7]=eight;
        arr[8]=nine;

        System.out.println(findMaxIndex(arr));
    }

    public static int findMaxIndex(int[] arr){
        int maxIndex = 0;
        int max = 0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]>max){
                maxIndex=i;
                max=arr[i];
            }
        }return maxIndex;
    }
}
