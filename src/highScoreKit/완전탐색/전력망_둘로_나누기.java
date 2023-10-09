package highScoreKit.완전탐색;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class 전력망_둘로_나누기 {
    private static ArrayList<Integer>[] init(int n, int[][] wires) {
        ArrayList<Integer>[] map = new ArrayList[n+1];

        for(int i = 0; i<=n ; i++) {
            map[i] = new ArrayList<>();
        }
        for(int[] wire : wires) {
            int x = wire[0];
            int y = wire[1];
            map[x].add(y);
            map[y].add(x);
        }
        return map;
    }
    private static int go(int[][] wires, ArrayList<Integer>[] map, int n) {
        boolean[] cut = new boolean[n + 1];
        int ans = Integer.MAX_VALUE;

        for(int i =0; i<wires.length ; i++) {
            int x = wires[i][0];
            int y = wires[i][1];
            cut[x] = true;
            cut[y] = true;
            ans = Math.min(ans, bfs(map, cut));
            cut[x] = false;
            cut[y] =false;
        } return ans;
    }
    public static int solution(int n, int[][] wires) {
        ArrayList<Integer>[] map = init(n, wires);
        return go(wires,map,n);
    }

    private static int bfs(ArrayList<Integer>[] map, boolean[] cut) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisit1 = new boolean[map.length];
        boolean[] isVisit2 = new boolean[map.length];

        int check = 0;
        for(int i =0; i<cut.length; i++) {
            if(cut[i]) {
                q.add(i);
                check = i;
                isVisit1[i] =true;
                break;
            }
        }
        setVisit(map, cut, q, isVisit1);
        q = new LinkedList<>();
        for(int i = 0; i<cut.length; i++) {
            if(cut[i] && i != check) {
                q.add(i);
                isVisit2[i] = true;
                break;
            }
        }
        setVisit(map, cut, q, isVisit2);

        return Math.abs(getCount(isVisit1) - getCount(isVisit2));
    }

    private static void setVisit(ArrayList<Integer>[] map, boolean[] cut, Queue<Integer> q, boolean[] isVisit) {
        while(!q.isEmpty()) {
            int x = q.poll();

            for(int num : map[x]) {
                if(!isVisit[num] && cut[num]) {
                    q.add(num);
                    isVisit[num] =true;
                }
            }
        }
    }

    private static int getCount(boolean[] isVisit) {
        int cnt = 0;

        for(int i = 0; i<isVisit.length; i++) {
            if(isVisit[i]) {
                cnt ++;
            }
        }
        return cnt;
    }
}
