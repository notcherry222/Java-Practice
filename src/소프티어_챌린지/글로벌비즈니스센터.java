package 소프티어_챌린지;

import java.io.*;
import java.util.*;

public class 글로벌비즈니스센터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Queue<String[]> q = new LinkedList<>();
        Queue<String[]> userq = new LinkedList<>();
        int max = -1;

        for(int i = 0; i<n; i++) {
            String[] command = br.readLine().split(" ");
            q.add(command);
        }
        for(int i = 0; i<m; i++) {
            String[] command = br.readLine().split(" ");
            userq.add(command);
        }

        while(!q.isEmpty()) {

            String[] qq = q.peek();
            int a = Integer.parseInt(qq[0]);
            int b = Integer.parseInt(qq[1]);
            String[] userqq = userq.peek();
            int usera = Integer.parseInt(userqq[0]);
            int userb = Integer.parseInt(userqq[1]);

            int diff = userb -b;
            if(diff>max) {
                max = diff;
            }

            if(a<=usera) {
                q.poll();
                userqq[0] = String.valueOf(usera - a);
                if(a == usera) {
                    userq.poll();
                }
            } else {
                qq[0] = String.valueOf(a-usera);
                userq.poll();
            }

        }
        System.out.println(max);
    }
}
