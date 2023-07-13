package basicCoding_Programmers.stringBuilder;

//이어 붙인 수
public class StringBuilderExample2 {
    int[] num_list = {3, 4, 5, 2, 1};

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();

            for(int i = 0; i< num_list.length ; i++){
                if(num_list[i]%2 == 0){
                    even.append(num_list[i]);
                }else {
                    odd.append(num_list[i]);
                }
            }

            int oddSum  = Integer.parseInt(odd.toString());
            int evenSum  = Integer.parseInt(even.toString());
            answer = oddSum + evenSum;

            return answer;


        }
    }
}
