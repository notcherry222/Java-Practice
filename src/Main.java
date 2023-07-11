public class Main {
    public static int main(String[] args) {
        String my_string= "banana";
        String is_suffix = "ana";
        int answer = 0;
        String[] el = new String[my_string.length()];
        for(int i =0; i<my_string.length();i++ ){
            el[i] = my_string.substring(my_string.length()-i-1);
        }
        for(int i = 0 ; i<my_string.length();i++){
            if(el[i].equals(is_suffix)){
               return  1;
            }
        }


        return answer;
    }


}