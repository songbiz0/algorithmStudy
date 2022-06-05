package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class S11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusQ = new PriorityQueue<>();
        PriorityQueue<Integer> minusQ = new PriorityQueue<>(Collections.reverseOrder());
        while(N-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if(x > 0) {
                plusQ.offer(x);
            } else if(x < 0) {
                minusQ.offer(x);
            } else {
                if(plusQ.isEmpty() && minusQ.isEmpty()) {
                    sb.append(0);
                } else if(plusQ.isEmpty()) {
                    sb.append(minusQ.poll());
                } else if(minusQ.isEmpty()) {
                    sb.append(plusQ.poll());
                } else {
                    int p = Math.abs(plusQ.peek());
                    int m = Math.abs(minusQ.peek());
                    sb.append(m <= p ? minusQ.poll() : plusQ.poll());
                }
                sb.append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
