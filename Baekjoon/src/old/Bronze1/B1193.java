package old.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int target = 1;
        int count = 1;
        while(X > target) {
            count++;
            target += count;
        }
        int dif = target - X;
        if(count % 2 == 1) {
            System.out.printf("%d/%d", dif + 1, count - dif);
        } else {
            System.out.printf("%d/%d", count - dif, dif + 1);
        }
    }
}
