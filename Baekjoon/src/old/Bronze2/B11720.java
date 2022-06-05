package old.Bronze2;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        char[] arr = new char[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = a.charAt(i);
        }
        int sum = 0;
        for(int i=0;i<arr.length; i++) {
            int b = Character.getNumericValue(arr[i]);
            sum += b;
        }
        System.out.println(sum);
    }
}
