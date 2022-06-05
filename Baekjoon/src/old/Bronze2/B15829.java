package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();
        BigInteger hash = new BigInteger("0");
        BigInteger r = new BigInteger("31");
        BigInteger M = new BigInteger("1234567891");
        for(int i=0; i<L; i++) {
            int val = chars[i] - 'a' + 1;
            hash = hash.add(r.pow(i).multiply(new BigInteger(String.valueOf(val))));
        }
        System.out.println(hash.remainder(M));
    }
}
