package _22강_이진_검색_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            PriorityQueue<Long> minQ = new PriorityQueue<>();
            PriorityQueue<Long> maxQ = new PriorityQueue<>(Collections.reverseOrder());
            Map<Long, Integer> map = new HashMap<>();
            int K = Integer.parseInt(br.readLine());
            while(K-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String order = st.nextToken();
                long val = Integer.parseInt(st.nextToken());
                if(order.equals("I")) {
                    minQ.offer(val);
                    maxQ.offer(val);
                    map.put(val, map.getOrDefault(val, 0) + 1);
                } else {
                    if(val == -1) {
                        removeFromMap(map, minQ);
                    } else {
                        removeFromMap(map, maxQ);
                    }
                }
            }
                Long max = removeFromMap(map, maxQ);
                Long min = removeFromMap(map, minQ);
                if(max == null && min == null) {
                    sb.append("EMPTY\n");
                } else if(max == null) {
                    sb.append(min).append(" ").append(min).append("\n");
                } else if(min == null) {
                    sb.append(max).append(" ").append(max).append("\n");
                } else {
                    sb.append(max).append(" ").append(min).append("\n");
                }
        }
        System.out.println(sb.toString().trim());
    }

    public static Long removeFromMap(Map<Long, Integer> map, PriorityQueue<Long> q) {
        Long val = null;
        while(true) {
            val = q.poll();
            if(val == null) {
                return null;
            }
            if (map.get(val) != null) {
                if (map.get(val) == 1) {
                    map.remove(val);
                } else {
                    map.put(val, map.get(val) - 1);
                }
                break;
            }
        }
        return val;
    }
}
