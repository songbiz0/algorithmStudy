package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer minus = new StringTokenizer(br.readLine(), "-");
        int init = 0;
        StringTokenizer plus = new StringTokenizer(minus.nextToken(), "+");
        while(plus.hasMoreTokens()) {
            init += Integer.parseInt(plus.nextToken());
        }
        while(minus.hasMoreTokens()) {
            plus = new StringTokenizer(minus.nextToken(), "+");
            while(plus.hasMoreTokens()) {
                init -= Integer.parseInt(plus.nextToken());
            }
        }
        System.out.println(init);
    }
}
