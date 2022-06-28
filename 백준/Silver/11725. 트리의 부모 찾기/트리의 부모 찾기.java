import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static List<List<Integer>> nodes;
	static int[] parents;
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		nodes = new ArrayList<>();
		for(int i=0; i<=N; i++) {
			nodes.add(new ArrayList<Integer>());
		}
		parents = new int[N + 1];
		visited = new boolean[N + 1];
		StringTokenizer st;
		for(int i=2; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			nodes.get(a).add(b);
			nodes.get(b).add(a);
		}			
		
		for(int i=1; i<=N; i++) {
			dfs(i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<=N; i++) {
			sb.append(parents[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void dfs(int val) {
		if(visited[val]) {
			return;
		}
		visited[val] = true;
		
		for(int num : nodes.get(val)) {
			if(visited[num]) {
				continue;
			}
			
			parents[num] = val;
			dfs(num);
		}
	}
}