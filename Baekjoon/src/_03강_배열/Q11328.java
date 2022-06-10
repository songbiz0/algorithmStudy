package _03강_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int[] arrA = new int[28];
            int[] arrB = new int[28];
            for(int i=0; i<a.length(); i++) {
                arrA[a.charAt(i) - 'a']++;
            }
            for(int i=0; i<b.length(); i++) {
                arrB[b.charAt(i) - 'a']++;
            }
            if(Arrays.equals(arrA, arrB)) {
                sb.append("Possible\n");
            } else {
                sb.append("Impossible\n");
            }
        }
        System.out.println(sb);
    }
}
