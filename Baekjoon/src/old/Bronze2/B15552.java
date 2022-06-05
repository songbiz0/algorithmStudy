package old.Bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        int numInt = Integer.parseInt(num);
        for(int i=0; i<numInt; i++) {
            String val = br.readLine();
            StringTokenizer st = new StringTokenizer(val);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String result = Integer.toString(a+b);
            bw.write(result);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
