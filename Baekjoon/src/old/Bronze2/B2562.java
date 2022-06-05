package old.Bronze2;


import java.util.Arrays;
import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(max<arr[i]) { max=arr[i]; }
        }
        String[] arr2 = new String[10];
        for(int i=0; i<9; i++) {
            arr2[i+1] = String.valueOf(arr[i]);
        }
        System.out.println(max);
        System.out.println(Arrays.asList(arr2).indexOf(String.valueOf(max)));
    }
}