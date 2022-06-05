package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 1;
        while(i<N) {
            int res = 0;
            int temp = i;
            while(temp!=0) {
                res += temp%10;
                temp /= 10;
            }
            if(res + i == N) {
                System.out.println(i);
                return;
            }
            i++;
        }
        System.out.println(0);
    }
}
