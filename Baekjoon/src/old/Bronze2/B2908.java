package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String[] arrA = arr[0].split("");
        int A = reverse(arrA);
        String[] arrB = arr[1].split("");
        int B = reverse(arrB);
        System.out.println(Math.max(A, B));
    }

    public static int reverse(String[] arr) {
        return Integer.parseInt(arr[2])*100 + Integer.parseInt(arr[1])*10 + Integer.parseInt(arr[0]);
    }
}
