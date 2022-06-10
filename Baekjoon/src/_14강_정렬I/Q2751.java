package _14강_정렬I;

import java.io.*;
import java.util.Arrays;

public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        for(int a : arr) {
            bw.write(a + "\n");
        }
        bw.flush();
        bw.close();
    }
}
