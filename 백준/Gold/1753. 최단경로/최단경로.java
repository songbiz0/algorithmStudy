import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        List<List<int[]>> nodes = new ArrayList<>();
        for(int i=0; i<V+1; i++) {
            nodes.add(new ArrayList<>());
        }
        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            nodes.get(u).add(new int[]{v, w});
        }

        StringBuilder sb = new StringBuilder();

            int[] dijk = new int[V+1];
            for(int j=0; j<V+1; j++) {
                dijk[j] = Integer.MAX_VALUE;
            }
            dijk[K] = 0;

            boolean found = false;
            Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
            q.offer(new int[]{K, 0});
            while(!q.isEmpty()) {
                int[] current = q.poll();
                int idx = current[0];
                int cost = current[1];
                if(cost > dijk[idx]) {
                    continue;
                }

                for(int[] arr : nodes.get(idx)) {
                    int nextIdx = arr[0];
                    int nextCost = arr[1];
                    if(cost + nextCost < dijk[nextIdx]) {
                        q.offer(new int[]{nextIdx, cost + nextCost});
                        dijk[nextIdx] = cost + nextCost;
                    }
                }
            }
        for(int i=1; i<dijk.length; i++) {
            if(dijk[i] == Integer.MAX_VALUE) {
                sb.append("INF").append("\n");
                continue;
            }
            sb.append(dijk[i]).append("\n");
        }
        System.out.println(sb);
    }
}