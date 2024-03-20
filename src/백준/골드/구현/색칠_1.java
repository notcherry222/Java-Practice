package 백준.골드.구현;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 11:00
 */
public class 색칠_1 {
    static int w,h,f,c,x1,x2,y1,y2,total;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        total = w*h;
        int rangeX = Math.min(w-f,f); //접힌 영역
        int realX =0;
        if(rangeX <= x1) {
            realX = x2-x1;
        } else if (rangeX<=x2 && rangeX >=x1) {
            realX = 2*(rangeX-x1) + (x2-rangeX);
        }else {
            realX = 2*(x2-x1);
        }
        total -= realX*(y2-y1)*(c+1);
        System.out.println(total);
    }
}
