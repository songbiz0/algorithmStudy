package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int resultY = 0;
        int resultM = 0;
        while(N-- > 0) {
            double time = Integer.parseInt(st.nextToken()) + 1;
            resultY += (int)Math.ceil(time / 30) * 10;
            resultM += (int)Math.ceil(time / 60) * 15;
        }
        if(resultY == resultM) {
            sb.append("Y M ").append(resultM);
        } else {
            sb.append(resultM > resultY ? "Y " : "M ").append(Math.min(resultM, resultY));
        }
        System.out.println(sb);
    }
}
