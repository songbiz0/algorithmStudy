package _19강_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            X[i] = Integer.parseInt(st.nextToken());
        }
        int[] X2 = X.clone();
        Arrays.sort(X2);
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int a : X2) {
            if(!map.containsKey(a)) {
                map.put(a, idx++);
            }
        }
        for(int a : X) {
            sb.append(map.get(a)).append(' ');
        }
        System.out.println(sb);
    }
}
