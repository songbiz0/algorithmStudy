package _21강_해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> passwords = new HashMap<>();
        while(N-- > 0) {
            st = new StringTokenizer(br.readLine());
            passwords.put(st.nextToken(), st.nextToken());
        }
        while(M-- > 0) {
            sb.append(passwords.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}
