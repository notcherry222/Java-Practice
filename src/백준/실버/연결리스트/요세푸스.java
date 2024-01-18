package 백준.실버.연결리스트;

import java.io.*;
import java.util.LinkedList;
/**
 * 1~N명의 사람, 양의 정수 K
 * K번째 사람 제거, -> N명의 사람이 모두 제거될 때까지.
 * 11:14
 */
public class 요세푸스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer N = Integer.parseInt(input[0]);
        Integer K = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        //N명 설정
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 1; i<N+1; i++) {
            list.add(i);
        }

        int index = 0; // 삭제할 인덱스

        while(N>1) {
            index = (index + (K-1)) % N;
            sb.append(list.get(index)).append(", ");
            list.remove(index);
            N--;
        }
        sb.append(list.get(0)).append('>');
        System.out.println(sb);
    }
}
