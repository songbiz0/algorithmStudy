package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int root = (int)Math.sqrt(n);
        int count = 1;
        for(int i=0; i<=root; i++) {
            if(i*i == n) {
                System.out.println(count);
                return;
            }
        }
        count++;
        for(int i=0; i<=root; i++) {
            for(int j=0; j<=root; j++) {
                if(i*i + j*j == n) {
                    System.out.println(count);
                    return;
                }
            }
        }
        count++;
        for(int i=0; i<=root; i++) {
            for(int j=0; j<=root; j++) {
                for(int k=0; k<=root; k++) {
                    if(i*i + j*j + k*k == n) {
                        System.out.println(count);
                        return;
                    }
                }
            }
        }
        count++;
        for(int i=0; i<=root; i++) {
            for (int j = 0; j <= root; j++) {
                for (int k = 0; k <= root; k++) {
                    for (int l = 0; l <= root; l++) {
                        if (i * i + j * j + k * k + l*l == n) {
                            System.out.println(count);
                            return;
                        }
                    }
                }
            }
        }
    }
}
