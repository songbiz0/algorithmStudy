import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        List<List<int[]>> nodes = new ArrayList<>();
        for(int i=0; i<N+1; i++) {
            nodes.add(new ArrayList<>());
        }
        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            nodes.get(start).add(new int[]{dest, cost});
            nodes.get(dest).add(new int[]{start, cost});
        }
        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        int[] startArr = new int[]{1, v1, v2};
        int[] destArr = new int[]{v1, v2, N};
        int resultCost1 = 0;
        for(int i=0; i<3; i++) {
            Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
            q.add(new int[]{startArr[i], 0});

            boolean isFound = false;
            int[] dijkstra = new int[N+1];
            for(int j=0; j<N+1; j++) {
                dijkstra[j] = Integer.MAX_VALUE;
            }

            while(!q.isEmpty()) {
                int[] cur = q.poll();
                int idx = cur[0];
                int cost = cur[1];

                if(idx == destArr[i]) {
                    isFound = true;
                    dijkstra[idx] = cost;
                    break;
                }

                if(dijkstra[idx] < cost) {
                    continue;
                }

                for(int[] next : nodes.get(idx)) {
                    int nextIdx = next[0];
                    int nextCost = next[1];
                    int sumCost = cost + nextCost;
                    if(dijkstra[nextIdx] > sumCost) {
                        q.offer(new int[]{nextIdx, sumCost});
                        dijkstra[nextIdx] = sumCost;
                    }
                }
            }

            if(!isFound) {
                System.out.println(-1);
                return;
            }
            resultCost1 += dijkstra[destArr[i]];
        }

        startArr = new int[]{1, v2, v1};
        destArr = new int[]{v2, v1, N};
        int resultCost2 = 0;
        for(int i=0; i<3; i++) {
            Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
            q.add(new int[]{startArr[i], 0});

            boolean isFound = false;
            int[] dijkstra = new int[N+1];
            for(int j=0; j<N+1; j++) {
                dijkstra[j] = Integer.MAX_VALUE;
            }

            while(!q.isEmpty()) {
                int[] cur = q.poll();
                int idx = cur[0];
                int cost = cur[1];

                if(idx == destArr[i]) {
                    isFound = true;
                    dijkstra[idx] = cost;
                    break;
                }

                if(dijkstra[idx] < cost) {
                    continue;
                }

                for(int[] next : nodes.get(idx)) {
                    int nextIdx = next[0];
                    int nextCost = next[1];
                    int sumCost = cost + nextCost;
                    if(dijkstra[nextIdx] > sumCost) {
                        q.offer(new int[]{nextIdx, sumCost});
                        dijkstra[nextIdx] = sumCost;
                    }
                }
            }

            if(!isFound) {
                System.out.println(-1);
                return;
            }
            resultCost2 += dijkstra[destArr[i]];
        }
        System.out.println(Math.min(resultCost1, resultCost2));
    }
}