package basicCoding_Programmers.simpleTF;

public class SimpleTrueOrFalse {


        boolean up(boolean a, boolean b){
            return a||b;    }

        boolean down(boolean a, boolean b){
            return a&&b;
        }

        public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

            boolean answer = true;

            boolean step1 = up(x1,x2);
            boolean step2 = up(x3, x4);
            answer = down(step1, step2);

            return answer;
        }
}
