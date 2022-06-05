package old.Bronze2;

import java.util.Scanner;

public class B10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=97; i<123; i++) {
            System.out.print(str.indexOf((char)i) + " ");
        }
    }
}
