package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        System.out.println(Math.PI*Math.pow(R, 2) + "\n" + Math.pow(R, 2)*2);
    }
}
