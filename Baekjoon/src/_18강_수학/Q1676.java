package _18강_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1676 {

    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        BigInteger result = factorial(N);
        while(result.mod(new BigInteger("10")).compareTo(new BigInteger("0")) == 0) {
            result = result.divide(new BigInteger("10"));
            count++;
        }
        System.out.println(count);
    }

    public static BigInteger factorial(BigInteger n) {
        return n.compareTo(new BigInteger("0")) == 0 ? new BigInteger("1") : n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }
}
