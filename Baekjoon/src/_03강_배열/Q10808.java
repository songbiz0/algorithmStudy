package _03강_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i<S.length(); i++) {
            arr[S.charAt(i) - 'a']++;
        }
        for(int n : arr) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);
    }
}
