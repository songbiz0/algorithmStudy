package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S11866Q {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> list = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            list.add(i);
        }
        sb.append("<");
        while(list.size()>0) {
            for(int i=0; i<K-1; i++) {
                list.offer(list.poll());
            }
            sb.append(list.poll()).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}