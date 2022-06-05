package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S17626U {
    static int[] squares;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        squares = new int[n+1];
        squares[0] = 0;
        squares[1] = 1;
        for(int i=2; i<=n; i++) {
            int count = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++) {
                count = Math.min(count, squares[i - j*j]);
            }
            squares[i] = count+1;
        }
        System.out.println(squares[n]);
    }
}
