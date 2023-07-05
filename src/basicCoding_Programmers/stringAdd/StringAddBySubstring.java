package basicCoding_Programmers.stringAdd;

public class StringAddBySubstring {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        String start = my_string.substring(0, s);
        String end = my_string.substring(s + overwrite_string.length());
        System.out.println(start + overwrite_string + end);
    }
}
