package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        sb.append("I");
        while(N-->0) {
            sb.append("OI");
        }
        String PN = sb.toString();
        int count = 0;
        while(true) {
            int idx = S.indexOf(PN);
            if(idx == -1) {
                break;
            }
            S = S.substring(idx+1);
            count++;
        }
        System.out.println(count);
    }
}
