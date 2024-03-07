package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Contact {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean answer = true;
        ArrayList<String> array = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<t; i++){
            String line =br.readLine();
            array.add(line);
        }

        for(int i = 0; i<t; i++) {
            Queue<Integer> q = new LinkedList<>();
            String line = array.get(i);
            for(int j=0; j<line.length(); j++) {
                q.add(Integer.parseInt(line.substring(j,j+1)));
            }

            while(!q.isEmpty()) {
                int a = q.poll();
                if(a == 0 && q.peek() == 1) {
                    q.poll();
                } else {
                    if(q.poll() == 0&& q.peek() == 0) {
                        while(q.peek() == 0) {
                            q.poll();
                        }
                        if(q.peek() == 1) {
                            q.poll();
                        }
                    } else {
                        answer = false;
                        break;
                    }
                }
            }

            if (!answer) {
                if(i <t-1) {
                    System.out.println("NO");
                } else {

                    System.out.print("NO");
                }
            }
            else {if(i <t-1) {
                System.out.println("YES");
            } else{
                System.out.print("YES");
            }
            }
            answer = true;
        }
    }
}
