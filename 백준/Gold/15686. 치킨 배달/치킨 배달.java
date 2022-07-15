import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static List<int[]> house;
    static List<int[]> chickenStore;
    static boolean[] closed;
    static int needToClose;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        house = new ArrayList<>();
        chickenStore = new ArrayList<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                int val = Integer.parseInt(st.nextToken());

                if(val == 1) {
                    house.add(new int[]{i, j});
                }
                if(val == 2) {
                    chickenStore.add(new int[]{i, j});
                }

                map[i][j] = val;
            }
        }
        closed = new boolean[chickenStore.size()];
        needToClose = chickenStore.size() - m;
        result = Integer.MAX_VALUE;

        close(0, 0);
        System.out.println(result);
    }

    static void close(int idx, int depth) {
        if(depth == needToClose) {
            int temp = 0;
            for(int i=0; i<house.size(); i++) {
                int distance = Integer.MAX_VALUE;
                for(int j=0; j< chickenStore.size(); j++) {
                    if(closed[j]) {
                        continue;
                    }

                    int xDelta = Math.abs(house.get(i)[0] - chickenStore.get(j)[0]);
                    int yDelta = Math.abs(house.get(i)[1] - chickenStore.get(j)[1]);
                    int tempDistance = xDelta + yDelta;
                    distance = Math.min(distance, tempDistance);
                }
                temp += distance;
            }
            result = Math.min(result, temp);
            return;
        }

        for(int i=idx; i<chickenStore.size(); i++) {
            if(closed[i]) {
                continue;
            }

            closed[i] = true;
            close(i + 1, depth + 1);
            closed[i] = false;
        }
    }
}
