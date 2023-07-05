package basicCoding_Programmers.stringAdd;

public class StringAddByArraycopy {
    public static void main(String[] args) {

        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        String l = my_string+overwrite_string;
        char[] c = new char[l.length()];


        String answer = "";
        char[] char1 = my_string.toCharArray();
        char[] char2 = overwrite_string.toCharArray();

        System.arraycopy(char2, 0, char1, s, char2.length );
        answer = new String(char1);

        System.out.println(answer);
    }
}
