package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(fibonacci(Integer.parseInt(br.readLine())));
    }

    public static int fibonacci(int n) {
        return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2);
    }
}
