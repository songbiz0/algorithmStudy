package _17강_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[N];
        for(int i=0; i<N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);
        int sum = 0;
        for(int i=0; i<time.length; i++) {
            sum += time[i] * N--;
        }
        System.out.println(sum);
    }
}
