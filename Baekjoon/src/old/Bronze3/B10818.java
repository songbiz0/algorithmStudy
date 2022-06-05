package old.Bronze3;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str1 = sc.nextLine();
        String[] arr1 = str1.split(" ");
        int max = 0;
        for(int i=0; i<arr1.length; i++) {
            if(Integer.parseInt(arr1[i])>max) {
                max = Integer.parseInt(arr1[i]);
            }
        }
    }
}
