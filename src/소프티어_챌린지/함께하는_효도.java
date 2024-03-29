package 소프티어_챌린지;

import java.io.*;
import java.util.*;

public class 함께하는_효도 {
    static class Node{
        int x;
        int y;
        int fruit;
        Node(int x,int y, int fruit){
            this.x = x;
            this.y = y;
            this.fruit = fruit;
        }
    }
    static int n,m,res;
    static List<Node> nodes;
    static int[][] harvest;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        res = Integer.MIN_VALUE;
        nodes = new ArrayList<>();
        harvest = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                harvest[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Node startNode = new Node(x - 1, y - 1, harvest[x - 1][y - 1]);
            nodes.add(startNode);
            harvest[x - 1][y - 1] = 0;
        }
        dfs(nodes.get(0), 1, 0, 0);

        System.out.println(res);
    }
    static void dfs(Node curNode, int ppl, int count, int max) {
        if (count == 3) {
            if (ppl < m) {
                dfs(nodes.get(ppl), ppl + 1, 0, curNode.fruit + max);
                return;
            }
            res = Math.max(res, max + curNode.fruit);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = curNode.x + dx[i];
            int ny = curNode.y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

            Node nextNode = new Node(nx, ny, curNode.fruit + harvest[nx][ny]);
            int tmp = harvest[nx][ny];
            harvest[nx][ny] = 0;
            dfs(nextNode, ppl, count + 1, max);
            harvest[nx][ny] = tmp;
        }
    }
}
