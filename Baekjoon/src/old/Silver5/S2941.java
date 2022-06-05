package old.Silver5;

import java.util.Scanner;

public class S2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(croa(sc.next()));
    }

    public static int croa(String str) {
        String[] arr = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        int count = 0;
        int notCount = 0;
        while(true) {
            for (String str1 : arr) {
                if(str.contains("dz=")) {
                    int a = str.length();
                    str = str.replace("dz=", " ");
                    int b = str.length();
                    count += (a-b)/2;
                    notCount = 0;
                }
                if(str.contains(str1)) {
                    int a = str.length();
                    str = str.replace(str1, " ");
                    int b = str.length();
                    count += a-b;
                    notCount = 0;
                } else {
                    notCount++;
                }
                if(notCount>=8) {
                    str = str.replace(" ", "");
                    return count + str.length();
                }
            }
        }
    }
}

