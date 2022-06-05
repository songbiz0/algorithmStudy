package old.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] chess = new boolean[N][M];
        for(int i=0; i<N; i++) {
            String[] line = br.readLine().split("");
            for(int j=0; j<line.length; j++) {
                if(line[j].equals("W")) {
                    chess[i][j] = true;
                }
            }
        }
        boolean check = true;
        int min = 64;
        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                int count = 0;
                for(int k=i; k<i+8; k++) {
                    for(int l=j; l<j+8; l++) {
                        if(chess[k][l] != check) {
                            count++;
                        }
                        check = !check;
                    }
                    check = !check;
                }
                count = Math.min(count, 64-count);
                if(count < min) {
                    min = count;
                }
            }
        }
        System.out.println(min);
    }
}
