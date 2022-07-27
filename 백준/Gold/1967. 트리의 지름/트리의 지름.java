import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<List<int[]>> nodes;
    static boolean[] visited;
    static int maxIdx;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        nodes = new ArrayList<>();
        for(int i=0; i<n+1; i++) {
            nodes.add(new ArrayList<>());
        }
        for(int i=0; i<n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int root = Integer.parseInt(st.nextToken());
            int leaf = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            nodes.get(root).add(new int[]{leaf, cost});
            nodes.get(leaf).add(new int[]{root, cost});
        }

        max = 0;
        maxIdx = 0;
        visited = new boolean[n+1];
        visited[1] = true;
        dfs(1, 0);

        visited = new boolean[n+1];
        visited[maxIdx] = true;
        dfs(maxIdx, 0);
        System.out.println(max);
    }

    static void dfs(int idx, int cost) {
        if(cost > max) {
            max = cost;
            maxIdx = idx;
        }

        for(int[] arr : nodes.get(idx)) {
            int nextLeaf = arr[0];
            int nextCost = arr[1];
            if(!visited[nextLeaf]) {
                visited[nextLeaf] = true;
                dfs(nextLeaf, cost + nextCost);
            }
        }
    }
}