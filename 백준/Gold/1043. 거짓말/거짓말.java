import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int knowingNumber = Integer.parseInt(st.nextToken());
        boolean[] knowing = new boolean[N+1];
        for(int i=1; i<=knowingNumber; i++) {
            knowing[Integer.parseInt(st.nextToken())] = true;
        }
        parent = new int[N+1];
        for(int i=1; i<=N; i++) {
            parent[i] = i;
        }
        List<int[]> parties = new ArrayList<>();
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int participantsNumber = Integer.parseInt(st.nextToken());
            int firstParticipant = Integer.parseInt(st.nextToken());
            int[] party = new int[participantsNumber];
            party[0] = firstParticipant;
            for(int j=1; j<participantsNumber; j++) {
                int nextParticipant = Integer.parseInt(st.nextToken());
                union(firstParticipant, nextParticipant);
                party[j] = nextParticipant;
            }
            parties.add(party);
        }

        boolean[] visited = new boolean[N+1];
        for(int i=1; i<=N; i++) {
            if(knowing[i] && !visited[i]) {
                int root = find(i);
                for(int j=1; j<=N; j++) {
                    if(find(j) == root) {
                        knowing[j] = true;
                        visited[j] = true;
                    }
                }
            }
        }

        int count = 0;
        for(int[] party : parties) {
            if(knowing[find(party[0])]) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }

    static int find(int val) {
        if(val == parent[val]) {
            return val;
        }

        return find(parent[val]);
    }

    static void union(int val1, int val2) {
        val1 = find(val1);
        val2 = find(val2);

        if(val1 == val2) {
            return;
        }

        if(val1 < val2) {
            parent[val2] = val1;
        } else {
            parent[val1] = val2;
        }
    }
}