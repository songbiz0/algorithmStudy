package old.Bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        double[] arr = new double[sub];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double max = arr[sub-1];
        double[] arr2 = new double[arr.length];
        for(int i=0; i<arr.length; i++) {
            arr2[i] = arr[i]/max*100;
        }
        double sum = 0.0;
        for(int i=0; i<arr.length; i++) {
            sum += arr2[i];
        }
        System.out.println(sum / sub);
    }
}
