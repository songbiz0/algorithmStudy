package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class S11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            int order = Integer.parseInt(br.readLine());
            if(order == 0) {
                Integer a = q.poll();
                sb.append(a == null ? 0 : a).append("\n");
            } else {
                q.add(order);
            }
        }
        System.out.println(sb);
    }
}
