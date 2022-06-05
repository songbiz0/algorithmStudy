package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double x1 = Integer.parseInt(st.nextToken());
            double y1 = Integer.parseInt(st.nextToken());
            double r1 = Integer.parseInt(st.nextToken());
            double x2 = Integer.parseInt(st.nextToken());
            double y2 = Integer.parseInt(st.nextToken());
            double r2 = Integer.parseInt(st.nextToken());

            double distance = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
            double distanceR = Math.abs(r1+r2);

            if(x1==x2 && y1==y2) {
                if(r1==r2) {
                    sb.append("-1\n");
                    continue;
                } else {
                    sb.append("0\n");
                    continue;
                }
            }

            if(x1+r1>x2+r2 && x1-r1<x2-r2 && y1+r1>y2+r2 && y1-r1<y2-r2) {
                sb.append("0\n");
                continue;
            } else if(x1+r1<x2+r2 && x1-r1>x2-r2 && y1+r1<y2+r2 && y1-r1>y2-r2) {
                sb.append("0\n");
                continue;
            }

            if(distance == Math.abs(r1-r2)) {
                sb.append("1\n");
                continue;
            }

            if(distance == distanceR) {
                sb.append("1\n");
            } else if (distance < distanceR) {
                sb.append("2\n");
            } else {
                sb.append("0\n");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
