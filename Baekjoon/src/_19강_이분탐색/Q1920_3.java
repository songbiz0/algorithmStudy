package _19강_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Arrays.sort(A);
        for(int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());
            int low = 0;
            int high = A.length-1;
            boolean exist = false;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(key == A[mid]) {
                    exist = true;
                    break;
                } else if(key > A[mid]) {
                    low = mid + 1;
                } else if(key < A[mid]) {
                    high = mid - 1;
                }
            }
            sb.append(exist ? 1 : 0).append("\n");
        }
        System.out.println(sb);
    }
}
