package old.Silver5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        Integer[] arr1 = new Integer[arr.length];
        for(int i=0; i<arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr1,Collections.reverseOrder());
        for(int n : arr1) {
            System.out.print(n);
        }
    }
}
