package _0x03강_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        Arrays.parallelSort(arr);
        int count = 0;
        int start = 0;
        int end = n - 1;
        while(start < end) {
            int sum = arr[end] + arr[start];
            if(sum == x) {
                count++;
                start++;
            } else if(sum > x) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(count);
    }
}
