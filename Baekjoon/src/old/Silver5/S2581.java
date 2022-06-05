package old.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class S2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int sum = 0;
        boolean atLeast = false;
        List<Integer> arr = new LinkedList<>();
        for(int i=n1; i<=n2; i++) {
            if(isPrime(i)) {
                atLeast = true;
                arr.add(i);
                sum += i;
            }
        }
        if(atLeast) {
            System.out.println(sum);
            System.out.println(arr.get(0));
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isPrime(int num) {
        if(num==1) {
            return false;
        }
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
