package old.Bronze3;

import java.util.Scanner;

public class B10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String a = sc.nextLine();
            String[] arr1 = a.split(" ");
            int aa = Integer.parseInt(arr1[0]);
            int bb = Integer.parseInt(arr1[1]);
            if (aa == 0 && bb == 0) {
                break;
            }
            System.out.println(aa+bb);
        }
    }
}
