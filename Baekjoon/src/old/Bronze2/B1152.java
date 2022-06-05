package old.Bronze2;

import java.util.Scanner;

public class B1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int blank = 0;
        for(String a : arr) {
            if(a.equals("")) {
                blank++;
            }
        }
        System.out.println(arr.length - blank);
    }
}
