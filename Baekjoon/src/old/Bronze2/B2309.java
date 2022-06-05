package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] arr2 = solve(arr);
        Arrays.sort(arr2);
        for(int n : arr2) {
            if(n == 0) {
                continue;
            }
            sb.append(n).append("\n");
        }
        System.out.println(sb);
    }

    static int[] solve(int[] arr) {
        for(int i=0; i<9; i++) {
            for(int j=i+1; j<9; j++) {
                int tempI = arr[i];
                int tempJ = arr[j];
                arr[i] = 0;
                arr[j] = 0;
                int sum = 0;
                for(int n : arr) {
                    sum += n;
                }
                if(sum == 100) {
                    return arr;
                }
                arr[i] = tempI;
                arr[j] = tempJ;
            }
        }
        return null;
    }
}
