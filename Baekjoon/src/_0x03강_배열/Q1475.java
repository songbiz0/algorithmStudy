package _0x03강_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        while(N != 0) {
            int num = N % 10;
            N /= 10;
            arr[num]++;
        }
        int six = arr[6];
        int nine = arr[9];
        double avg = Math.ceil((six + nine) / 2.0);
        arr[6] = arr[9] = (int)avg;
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
