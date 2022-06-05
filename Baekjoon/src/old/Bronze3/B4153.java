package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] tri = new int[3];
            tri[0] = Integer.parseInt(st.nextToken());
            if(tri[0] == 0) {
                break;
            }
            tri[1] = Integer.parseInt(st.nextToken());
            tri[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(tri);
            if(Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)) {
                sb.append("right");
            } else {
                sb.append("wrong");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
