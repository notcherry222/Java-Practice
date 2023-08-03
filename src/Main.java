import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String a = "12";
        String b = "2123";
        a.substring(0,4).contains(b);
        
        System.out.println(a.contains(b));
        System.out.println(b.contains(a));
    }
}