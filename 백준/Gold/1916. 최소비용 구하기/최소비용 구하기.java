import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<List<int[]>> buses = new ArrayList<>();
        for(int i=0; i<N+1; i++) {
            buses.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            buses.get(from).add(new int[]{to, cost});
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int destination = Integer.parseInt(st.nextToken());

        int[] cost = new int[N+1];
        for(int i=0; i<cost.length; i++) {
            cost[i] = Integer.MAX_VALUE;
        }
        cost[start] = 0;

        Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        q.offer(new int[]{start, 0});

        while(!q.isEmpty()) {
            int[] arr = q.poll();
            int nowCity = arr[0];
            int nowCost = arr[1];

            if(nowCity == destination) {
                System.out.println(cost[destination]);
                return;
            }

            if(cost[nowCity] < nowCost) {
                continue;
            }

            for(int[] nextArr : buses.get(nowCity)) {
                int nextCity = nextArr[0];
                int nextCost = nextArr[1];
                if(cost[nextCity] > cost[nowCity] + nextCost) {
                    cost[nextCity] = cost[nowCity] + nextCost;
                    q.offer(new int[]{nextCity, cost[nextCity]});
                }
            }
        }
    }
}