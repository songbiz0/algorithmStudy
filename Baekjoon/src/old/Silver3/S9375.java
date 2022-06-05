package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map;
        Set<String> set;
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            map = new HashMap<>();
            set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String category = st.nextToken();
                set.add(category);
                map.put(category, map.getOrDefault(category, 1) + 1);
            }
            int kinds = 1;
            Iterator<String> it = set.iterator();
            while(it.hasNext()) {
                kinds *= map.get(it.next());
            }
            sb.append(kinds - 1).append("\n");
        }
        System.out.println(sb);
    }
}
