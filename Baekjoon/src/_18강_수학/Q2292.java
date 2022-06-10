package _18강_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int target = 1;
        while(N>target) {
            target += count*6;
            count++;
        }
        System.out.println(count);
    }
}
