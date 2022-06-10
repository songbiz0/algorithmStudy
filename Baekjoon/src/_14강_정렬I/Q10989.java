package _14강_정렬I;

import java.io.*;
import java.util.Arrays;

public class Q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        for(int num : arr) {
            bw.write(String.valueOf(num) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
