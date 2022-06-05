package _0x03강_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[7][2];
        while(N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            arr[grade][gender]++;
        }
        int count = 0;
        for(int i=1; i<7; i++) {
            for(int j=0; j<2; j++) {
                count += Math.ceil(arr[i][j] / (double)K);
            }
        }
        System.out.println(count);
    }
}
