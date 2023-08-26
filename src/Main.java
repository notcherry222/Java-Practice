import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public String[] solution(String[] names) {
        ArrayList<String> a = new ArrayList<> ();

        for(int i = 0 ; i<names.length; i++){
            if(i%5 == 0){
                a.add(names[i]);
            }
        }
        String[] answer = new String[a.size()];
        for(int i = 0; i<a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}