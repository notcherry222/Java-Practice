package 소프티어_챌린지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 회의실예약 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =9;
        List<List<Integer>> time = new ArrayList<>();
        String[] rooms = new String[n];
        //초기화
        for(int i =0;i<n;i++) {
            rooms[i] = Arrays.toString(br.readLine().split(" "));
            for(int j = 0; j<10;j++){
                time.get(i).add(j+9);
            }

        }
        if(time.get(n).containsAll(Collections.singleton(0))) {

        }
        if(time.get(1).get(2) == 9) {

        }
    }
}
