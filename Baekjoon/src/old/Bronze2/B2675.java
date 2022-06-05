package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String[] arr = br.readLine().split(" ");
            String[] arr2 = arr[1].split("");
            for(int j=0; j<arr2.length; j++) {
                for(int k=0; k<Integer.parseInt(arr[0]); k++) {
                    sb.append(arr2[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
