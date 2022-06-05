package old.Bronze3;

import java.util.Scanner;
import static java.lang.Integer.toBinaryString;

public class B1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int a = Integer.valueOf(num, 8);
        String b = toBinaryString(a);
        System.out.println(b);
    }
}
