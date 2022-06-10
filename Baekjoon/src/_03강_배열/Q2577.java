package _03강_배열;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n0 = 0;
        int result = a*b*c;
        String str = String.valueOf(result);
        char[] arr = str.toCharArray();
        for(char num : arr) {
            switch(num) {
                case '1' :
                    n1++;
                    continue;
                case '2' :
                    n2++;
                    continue;
                case '3' :
                    n3++;
                    continue;
                case '4' :
                    n4++;
                    continue;
                case '5' :
                    n5++;
                    continue;
                case '6' :
                    n6++;
                    continue;
                case '7' :
                    n7++;
                    continue;
                case '8' :
                    n8++;
                    continue;
                case '9' :
                    n9++;
                    continue;
                default:
                    n0++;
            }
        }
        System.out.println(n0);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println(n8);
        System.out.println(n9);
    }
}
