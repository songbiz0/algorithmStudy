package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];
        int ansX = 0;
        int ansY = 0;
        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        if(x[0]==x[1]) {
            ansX = x[2];
        } else if(x[1]==x[2]) {
            ansX = x[0];
        } else {
            ansX = x[1];
        }
        if(y[0]==y[1]) {
            ansY = y[2];
        } else if(y[1]==y[2]) {
            ansY = y[0];
        } else {
            ansY = y[1];
        }
        System.out.println(ansX + " " + ansY);
    }
}
