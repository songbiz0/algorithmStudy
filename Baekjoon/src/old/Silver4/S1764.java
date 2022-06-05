package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int t = N+M;
        Map<String, Integer> people = new HashMap<>();
        Set<String> peopleSet = new TreeSet<>();
        while(t-- > 0) {
            String name = br.readLine();
            people.put(name, people.getOrDefault(name, 0)+1);
            peopleSet.add(name);
        }
        Iterator<String> iter = peopleSet.iterator();
        int count = 0;
        while(iter.hasNext()) {
            String name = iter.next();
            int n = people.get(name);
            if(n > 1) {
                count++;
                sb.append(name).append("\n");
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
