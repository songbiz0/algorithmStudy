package old.Bronze3;

import java.util.Scanner;

public class B10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        int min = 101;
        if(a>max) {
            max = a;
        } if(b>max) {
            max = b;
        } if(c>max) {
            max = c;
        }
        if(a<min) {
            min = a;
        } if(b<min) {
            min = b;
        } if(c<min) {
            min = c;
        }
        if(a!=max && a!=min) {
            System.out.println(a);
        } else if(b!=max && b!=min) {
            System.out.println(b);
        } else if(c!=max && c!=min) {
            System.out.println(c);
        } else if(a==b) {
            System.out.println(a);
        } else if(b==c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
