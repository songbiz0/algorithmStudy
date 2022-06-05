package old.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G9019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(bfs(A, B)).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    public static String bfs(int A, int B) {
        String[] com = new String[10000];
        boolean[] visited = new boolean[10000];
        Arrays.fill(com, "");
        Queue<Integer> q = new LinkedList<>();
        q.offer(A);
        visited[A] = true;
        while (true) {
            int now = q.poll();
            if (now == B) {
                return com[B];
            }
            int d = D(now);
            if (!visited[d]) {
                visited[d] = true;
                q.offer(d);
                com[d] = com[now] + "D";
            }
            int s = S(now);
            if (!visited[s]) {
                visited[s] = true;
                q.offer(s);
                com[s] = com[now] + "S";
            }
            int l = L(now);
            if (!visited[l]) {
                visited[l] = true;
                q.offer(l);
                com[l] = com[now] + "L";
            }
            int r = R(now);
            if (!visited[r]) {
                visited[r] = true;
                q.offer(r);
                com[r] = com[now] + "R";
            }
        }
    }

    public static int D(int val) {
        int res = val * 2;
        return res > 9999 ? res % 10000 : res;
    }

    public static int S(int val) {
        return val == 0 ? 9999 : val - 1;
    }

    public static int L(int val) {
        int a = val / 1000;
        int b = (val - (a * 1000)) * 10;
        return a + b;
    }

    public static int R(int val) {
        int a = val % 10;
        int b = val / 10;
        return a * 1000 + b;
    }
}
