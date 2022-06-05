package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        if(N < 100) {
            System.out.println(N);
        } else {
            for (int i = 100; i <= N; i++) {
                boolean isNum = false;
                String str = String.valueOf(i);
                for (int j = 0; j < str.length()-2; j++) {
                    int a = str.charAt(j);
                    int b = str.charAt(j+1);
                    int c = str.charAt(j+2);
                    if(a-b != b-c) {
                        break;
                    }
                    isNum = true;
                }
                if(isNum) {
                    count++;
                }
            }
            System.out.println(count + 99);
        }
    }
}
