package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            int[] arr1 = new int[n+1];
            for(int j=0; j<arr1.length; j++) {
                arr1[j] = j;
            }
            for(int j=1; j<=k; j++) {
                arr1 = up(arr1);
            }
            System.out.println(arr1[n]);
        }
    }

    public static int[] up(int[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=0; j<=i; j++) {
                sum += arr[j];
            }
            arr2[i] = sum;
        }
        return arr2;
    }
}
