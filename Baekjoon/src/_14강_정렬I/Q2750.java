package _14강_정렬I;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int val : arr) {
            System.out.println(val);
        }
    }
}
