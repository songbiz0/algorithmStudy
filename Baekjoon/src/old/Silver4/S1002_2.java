package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1002_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance = (int)Math.pow(x2-x1,2)+(int)Math.pow(y2-y1,2);

            if(x1==x2 && y1==y2 && r1==r2) {
                sb.append(-1);
            } else if(distance < Math.pow(r2-r1,2)) {
                sb.append(0);
            } else if(distance == Math.pow(r2-r1,2)) {
                sb.append(1);
            } else if(distance > Math.pow(r1+r2,2)) {
                sb.append(0);
            } else if(distance == Math.pow(r2+r1,2)) {
                sb.append(1);
            } else {
                sb.append(2);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
