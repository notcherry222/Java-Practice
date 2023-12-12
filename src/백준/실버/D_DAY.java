package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1308
public class D_DAY {
    private static int check (int year) {
        if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            return 1;
        } else{
            return 0;
        }
    }

    private static int daysInMonth(int month){
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[month];
    }

    private static int calculate(int year, int month, int day) {
        int days = 0;
        for(int i = 1; i<year; i++) {
            days += 365 + check(i);
        }
        for (int i = 1; i<month; i++) {
            days+=daysInMonth(i);
            if (i == 2 ) {
                days += check(year);
            }
        }
        days += day;

        return days;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] start = new int[3];
        int[] end = new int[3];
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        for(int i = 0; i<3; i++) {
           start[i] = Integer.parseInt(first[i]);
           end[i] = Integer.parseInt(second[i]);
        }

        int a = calculate(end[0], end[1], end[2]);
        int b = calculate(start[0], start[1],start[2]);

        if (end[0] - start[0] > 1000 ||
                ( end[0] - start[0] == 1000 && (start[1] < end[1] || start[1] == end[1] && start[2] <= end[2]))) {
            System.out.println("gg");
        } else {
            System.out.println("D-" + (a - b));
        }
    }
}
