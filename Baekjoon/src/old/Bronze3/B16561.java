package old.Bronze3;

import java.io.*;

public class B16561 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numst = br.readLine();
        br.close();
        int num = Integer.parseInt(numst);
        int count = 0;
        for(int i=1; i<=(num-6)/3; i++) {
            for(int j=1; j<=(num-6-i+1)/3; j++) {
                for(int k=(num/3)-i-j; k<=(num-6-i-j+2)/3&&k>0; k++) {
                    if(3*i + 3*j + 3*k == num) {
                        count += 1;
                    }
                }
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
