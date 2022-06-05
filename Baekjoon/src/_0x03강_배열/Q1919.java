package _0x03강_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int[] arr = new int[28];
        for(int i=0; i<a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
        }
        for(int i=0; i<b.length(); i++) {
            arr[b.charAt(i) - 'a']--;
        }
        int count = 0;
        for(int n : arr) {
            count += Math.abs(n);
        }
        System.out.println(count);
    }
}
