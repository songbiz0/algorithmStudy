package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            System.out.println(isPs(br.readLine()) ? "YES" : "NO");
        }
    }

    public static boolean isPs(String str) {
        int a = 0;
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("(")) {
                a++;
            } else {
                a--;
            }
            if(a<0) {
                return false;
            }
        }
        if(a!=0) {
            return false;
        } else {
            return true;
        }
    }
}
