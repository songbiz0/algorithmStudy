package old.Silver5;

import java.util.Scanner;

public class S2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int d = 0;
        int i = a > b ? b : a;
        while(true) {
            if(a % i == 0 && b % i == 0) {
                c = i;
                break;
            }
                i--;
        }
        i = a > b ? a : b;
        while(true) {
            if(i % a == 0 && i % b == 0) {
                d = i;
                break;
            }
            i++;
        }
        System.out.println(c);
        System.out.println(d);
    }
}
