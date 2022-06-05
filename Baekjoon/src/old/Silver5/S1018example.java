package old.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1018example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numArr = br.readLine().split(" ");
        int N = Integer.parseInt(numArr[0]);
        int M = Integer.parseInt(numArr[1]);
        boolean[][] arr = new boolean[N][M];

        for(int i=0; i<arr.length; i++) {
            String str = br.readLine();
            for(int j=0; j<arr[i].length; j++) {
                if(str.charAt(j) == ('W')) {
                    arr[i][j] = true;
                    continue;
                }
                arr[i][j] = false;
            }
        }

        int min = 64;

        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                int endX = i + 8;
                int endY = j + 8;
                int count = 0;

                boolean TF = arr[i][j];

                for(int k=i; k<endX; k++) {
                    for(int l=j; l<endY; l++) {
                        if(arr[k][l] != TF) {
                            count++;
                        }
                        TF = !TF;
                    }
                    TF = !TF;
                }

                count = Math.min(count, 64 - count);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);
    }
}
