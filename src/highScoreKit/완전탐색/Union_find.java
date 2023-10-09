package highScoreKit.완전탐색;

public class Union_find {
    static int[] parent;
    private static boolean union(int x, int y){
        x = find(x); //x의 부모 찾기
        y = find(y);

        //같은 부모를 가지면 false
        if(x == y) return false;

        if(x<=y) parent[y] = x;
        else parent[x] = y;
        return true;
    }

    private static int find(int x){
        if(parent[x] == x) return x;
        return find(parent[x]);
    }

}
