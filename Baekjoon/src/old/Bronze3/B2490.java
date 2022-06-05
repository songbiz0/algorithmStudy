package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = 3;
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            while (st.hasMoreTokens()) {
                if (st.nextToken().equals("0")) {
                    count++;
                }
            }
            switch (count) {
                case 0:
                    sb.append("E\n");
                    break;
                case 1:
                    sb.append("A\n");
                    break;
                case 2:
                    sb.append("B\n");
                    break;
                case 3:
                    sb.append("C\n");
                    break;
                case 4:
                    sb.append("D\n");
            }
        }
        System.out.println(sb);
    }
}
