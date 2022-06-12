package _18강_수학;

import java.io.*;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int date = 0;
        int h = 0;
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);
        br.close();
        bw.write(String.valueOf((int)Math.ceil((double)(v-b)/(a-b))));
        bw.flush();
        bw.close();
    }
}
