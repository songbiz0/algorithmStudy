package _18강_수학;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int five = sugar / 5;
        int three = sugar / 3;
        int min = 5001;
        for (int i = 0; i < five+1; i++) {
            for (int j = 0; j < three+1; j++) {
                if (i * 5 + j * 3 == sugar) {
                    if (i + j < min) {
                        min = i + j;
                    }
                }
            }
        }
        if (min == 5001) {
            min = -1;
        }
        System.out.println(min);
    }
}
