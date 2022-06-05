package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[21];
        for(int i=1; i<arr.length; i++) {
            arr[i] = i;
        }
        int t = 10;
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int tempA = a;
            int tempB = b;
            int[] arr2 = new int[b-a+1];
            for(int i=0; i<arr2.length; i++) {
                arr2[i] = arr[tempB--];
            }
            for(int i=0; i<arr2.length; i++) {
                arr[tempA++] = arr2[i];
            }
        }
        for(int n : arr) {
            if(n == 0) {
                continue;
            }
            sb.append(n).append(" ");
        }
        System.out.println(sb);
    }
}
