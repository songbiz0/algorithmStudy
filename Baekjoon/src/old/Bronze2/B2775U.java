package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775U {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apt = new int[15][15];
        for(int i=0; i<apt.length; i++) {
            apt[0][i] = i;
            apt[i][1] = 1;
        }
        for(int i=1; i<apt.length; i++) {
            for(int j=2; j<apt[i].length; j++) {
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
    }
}
