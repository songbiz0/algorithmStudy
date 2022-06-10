package _23강_우선순위_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            int order = Integer.parseInt(br.readLine());
            if(order == 0) {
                Integer next = heap.poll();
                sb.append(next == null ? 0 : next).append("\n");
            } else {
                heap.offer(order);
            }
        }
        System.out.println(sb);
    }
}
