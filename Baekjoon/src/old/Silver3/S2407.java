package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class S2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());
        System.out.println(factorial(n).divide(factorial(n.subtract(m))).divide(factorial(m)));
    }

    static BigInteger factorial(BigInteger num) {
        if(num.toString().equals("1")) {
            return num;
        }
        return factorial(num.subtract(BigInteger.ONE)).multiply(num);
    }
}
