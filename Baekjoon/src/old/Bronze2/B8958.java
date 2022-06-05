package old.Bronze2;

import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++) {
            int bonus = 0;
            int score = 0;
            String str = sc.next();
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j)=='O') {
                    bonus++;
                    score += bonus;
                } else {
                    bonus = 0;
                }
            }
            System.out.println(score);
        }
    }
}
