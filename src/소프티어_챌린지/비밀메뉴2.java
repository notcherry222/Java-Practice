package 소프티어_챌린지;

import java.io.*;
import java.util.*;

public class 비밀메뉴2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] brbr = br.readLine().split(" ");
        int n = Integer.parseInt(brbr[0]);
        int m = Integer.parseInt(brbr[1]);
        int k = Integer.parseInt(brbr[2]);
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");
        StringBuilder firstbd = new StringBuilder();
        StringBuilder secondbd = new StringBuilder();

        for(String f : first) {
            firstbd.append(f);
        }
        for(String s : second) {
            secondbd.append(s);
        }

        int max = -1;
        int count = 0;

        for(int i =0; i<first.length; i++){
            for(int j =i+1; j<first.length+1; j++) {
                String command = firstbd.toString().substring(i, j); // 서브스트링 로깅
                if(secondbd.toString().contains(firstbd.toString().substring(i,j))) {

                    count = firstbd.toString().substring(i, j).length();
                }
                if(count > max) {
                    max = count;
                }
            }
        }

        System.out.println(max);
    }
}
