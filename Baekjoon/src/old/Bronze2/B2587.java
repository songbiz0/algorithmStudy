package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            arr[i] = n;
        }
        Arrays.sort(arr);
        sb.append(sum / 5).append("\n").append(arr[2]);
        System.out.println(sb);
    }
}
