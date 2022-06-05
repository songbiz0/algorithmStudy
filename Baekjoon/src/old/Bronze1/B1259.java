package old.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String a = br.readLine();
            if(a.equals("0")) {
                break;
            }
            String b = new StringBuffer(a).reverse().toString();
            sb.append(a.equals(b) ? "yes\n" : "no\n");
        }
        System.out.println(sb);
    }
}
