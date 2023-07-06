package basicCoding_Programmers.stringBuilder;

public class stringBuilderExample {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        int l = numLog.length;
        StringBuilder answer = new StringBuilder();

        for(int i = 0 ; i<l-1 ; i++){
            if( Math.abs(numLog[i+1]-numLog[i]) == 1){
                if(numLog[i+1]>numLog[i]){
                    answer.append( "w" );}
                else{answer.append( "s" );}
            }else{
                if(numLog[i+1]>numLog[i]){
                    answer.append( "d" );}
                else{
                    answer.append( "a" );}
            }
        }

        System.out.println(answer.toString());
    }
}
