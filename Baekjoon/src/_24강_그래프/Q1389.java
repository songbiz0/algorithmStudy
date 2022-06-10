package _24강_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1389 {
    static ArrayList<Integer>[] users;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        users = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            users[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            users[a].add(b);
            users[b].add(a);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=N; i++) {
            int score = 0;
            for(int j=1; j<=N; j++) {
                if(i == j) {
                    continue;
                }
                score += bfs(i, j);
            }
            map.put(i, score);
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((o1, o2) -> {
            if(o1.getValue().equals(o2.getValue())) {
                return o1.getKey() - o2.getKey();
            }
            return o1.getValue() - o2.getValue();
        });
        System.out.println(entryList.get(0).getKey());
    }

    public static int bfs(int from, int to) {
        int count = 0;
        boolean[] visited = new boolean[N+1];
        visited[from] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(from);
        while(true) {
            int t = q.size();
            for(int i=0; i<t; i++) {
                int a = q.poll();
                if(a == to) {
                    return count;
                }
                visited[a] = true;
                for(int j=0; j<users[a].size(); j++) {
                    int b = users[a].get(j);
                    if(!visited[b]) {
                        q.offer(b);
                    }
                }
            }
            count++;
        }
    }
}
