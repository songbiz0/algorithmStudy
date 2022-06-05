package old.Bronze1;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        String[] arr = new String[2];
        if(a<10) {
            arr[0] = "0";
            arr[1] = String.valueOf(a);
        } else {
            arr[0] = String.valueOf((a - (a % 10)) / 10);
            arr[1] = String.valueOf(a % 10);
        }
        int i=0;
        while(true) {
            int b = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            count++;
            arr[0] = arr[1];
            arr[1] = String.valueOf(b % 10);
            b = Integer.parseInt(arr[0])*10 + Integer.parseInt(arr[1]);
            if(b == a) {
                break;
            }
        }
        System.out.println(count);
    }
}
