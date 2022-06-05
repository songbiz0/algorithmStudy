package _0x03강_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        String v = br.readLine();
        int count = 0;
        for(int i=0; i<N; i++) {
            if(st.nextToken().equals(v)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
