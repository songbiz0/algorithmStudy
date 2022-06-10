package _22강_이진_검색_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Q7662_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            SortedMap<Integer, Integer> map = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            while(k-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String order = st.nextToken();
                Integer val = Integer.parseInt(st.nextToken());
                if(order.equals("I")) {
                    map.put(val, map.getOrDefault(val, 0) + 1);
                } else {
                    if(map.size() == 0) {
                        continue;
                    } else if(val == -1) {
                        Integer target = map.firstKey();
                        Integer count = map.get(target);
                        if(count == 1) {
                            map.remove(target);
                        } else {
                            map.put(target, map.get(target)-1);
                        }
                    } else {
                        Integer target = map.lastKey();
                        Integer count = map.get(target);
                        if(count == 1) {
                            map.remove(target);
                        } else {
                            map.put(target, count-1);
                        }
                    }
                }
            }
            sb.append(map.size() == 0 ? "EMPTY" : map.lastKey() + " " + map.firstKey()).append("\n");
        }
        System.out.println(sb);
    }
}
