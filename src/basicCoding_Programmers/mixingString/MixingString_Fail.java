package basicCoding_Programmers.mixingString;

public class MixingString_Fail {
    /**
     * 답은 나오지만 문제에서는 인정 안 해줌
     * @param args
     */
    public static void main(String[] args) {

        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String str = str1+str2;
        char[] answer = new char[str.length()];
        String a = "";
        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();
        for(int i = 0; i<str1.length();i++){
            answer[2*i] += char1[i];
            answer[2*i+1] += char2[i];
        }

        a = new String(answer);
        System.out.println(a);
    }
}
