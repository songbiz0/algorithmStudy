package _19강_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arrStr = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        Arrays.sort(arr);
        for(int i=0; i<M; i++) {
            int a = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr, a) ? 1 : 0).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean binarySearch(int[] arr, int number) {
        int idx = arr.length/2;
        while(true) {
            if (arr[idx] == number) {
                return true;
            } else if(arr[idx] > number) {
                int tem = idx;
                idx /= 2;
                if(tem == idx) {
                    return false;
                }
            } else if(arr[idx] < number) {
                int tem = idx;
                idx *= 1.5;
                if(idx >= arr.length) {
                    idx = arr.length-1;
                }
                if(tem == idx) {
                    return false;
                }
            }
        }
    }
}
