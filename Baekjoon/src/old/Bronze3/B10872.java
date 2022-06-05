package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[2];
        arr[0] = arr[1] = N;
        System.out.println(factorial(arr)[0]==0 ? 1 : factorial(arr)[0]);
    }

    public static int[] factorial(int[] arr) {
        if(arr[1]>1) {
            arr[0] *= --arr[1];
            return factorial(arr);
        } else {
            return arr;
        }
    }
}
