package highScoreKit.완전탐색;

public class 전력망을_둘로_나누기 {
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

    public int solution(int n, int[][] wires) {
        int answer = -1;
        return answer;
    }
}
