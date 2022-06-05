package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class S4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            BigInteger N = new BigInteger(String.valueOf(n));
            while(true) {
                sb.append("1");
                BigInteger A = new BigInteger(sb.toString());
                if(A.remainder(N).toString().equals("0")) {
                    System.out.println(sb.length());
                    sb.setLength(0);
                    break;
                }
            }
        }
    }
}
