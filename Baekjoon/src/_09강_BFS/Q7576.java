package _09강_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {
    static int[][] tomatoes;
    static Queue<Integer[]> q;
    static int days;
    static boolean atLeast;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        tomatoes = new int [N][M];
        q = new LinkedList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                int val = Integer.parseInt(st.nextToken());
                tomatoes[i][j] = val;
                if(val == 1) {
                    q.offer(new Integer[]{i, j});
                }
            }
        }
        days = -2;
        boolean isFin = false;
        while(!isFin) {
            isFin = tomato();
            days++;
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(tomatoes[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(days);
    }

    public static boolean tomato() {
        atLeast = false;
        int t = q.size();
        for(int i=0; i<t; i++) {
            Integer[] next = q.poll();
            int y = next[0];
            int x = next[1];
            atLeast = true;
            if(y > 0) {
                ripen(y-1, x);
            }
            if(x > 0) {
                ripen(y, x-1);
            }
            if(y < tomatoes.length-1) {
                ripen(y + 1, x);
            }
            if(x < tomatoes[y].length - 1) {
                ripen(y, x + 1);
            }
        }
        return !atLeast;
    }

    public static void ripen(int y, int x) {
        int now = tomatoes[y][x];
        if(now == 0) {
            tomatoes[y][x] = 1;
            q.offer(new Integer[]{y, x});
        }
    }
}
