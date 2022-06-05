package old.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);
        System.out.println(bep(A, B, C));
    }

    public static int bep(int A, int B, int C) {
        double profit = C-B;
        if(profit<=0) {
            return -1;
        }
        int count = (int)Math.ceil((A+1) / profit);
        return count;
    }
}
