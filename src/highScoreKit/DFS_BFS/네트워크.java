package highScoreKit.DFS_BFS;

public class 네트워크 {
    public int solution(int n, int[][] computers) {
        boolean v[] = new boolean[n];
        int answer =0;

        for(int i = 0; i<n; i++) {
            if(v[i] == false) {
                answer++;
                dfs(i,v,computers);

            }
        }
        return answer;
    }
    public void dfs(int i,boolean[] v, int[][] computers) {
        v[i] = true;

        for(int k =0; k<computers.length; k++) { if(v[i] == false && computers[i][k] == 1){
            dfs(k,v,computers);}
        }
    }
}
