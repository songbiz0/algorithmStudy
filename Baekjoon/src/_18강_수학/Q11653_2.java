package _18강_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=2; i<=Math.sqrt(N); i++) {
            while(N % i == 0) {
                N /= i;
                System.out.println(i);
            }
        }
        if(N != 1) {
            System.out.println(N);
        }
    }
}
