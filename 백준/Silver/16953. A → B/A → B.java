import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        visited = new boolean[B + 1];
        count = 1;

        System.out.println(bfs(A, B) ? count : -1);

    }

    public static boolean bfs(int A, int B) {
        Queue<Integer> q = new LinkedList<>();
        q.add(B);

        while(!q.isEmpty()) {
            int val = q.poll();
            if(visited[val]) {
                continue;
            }

            if(val == A) {
                return true;
            }
            count++;
            visited[val] = true;

            if(val % 2 == 0) {
                q.add(val / 2);
            }
            if(val % 10 == 1) {
                q.add((val - 1) / 10);
            }
        }

        return false;
    }
}