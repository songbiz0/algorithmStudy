package _18강_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String[] arr = br.readLine().split(" ");

        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(arr[i]);
            if(isPrime(a)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
