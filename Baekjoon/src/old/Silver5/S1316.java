package old.Silver5;

import java.util.Scanner;

public class S1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tryN = sc.nextInt();
        int count = 0;
        boolean isGroup = false;
        for(int i=0; i<tryN; i++) {
            String str = sc.next();
            boolean[] arr = new boolean[27];
            for(int j=0; j<str.length(); j++) {
                isGroup = true;
                int a = (int)str.charAt(j)-96;
                if(!arr[a]) {
                    arr[a] = true;
                }
                else if(str.charAt(j) == str.charAt(j-1)) {
                } else {
                    isGroup = false;
                    break;
                }
            }
            if(isGroup) {
                count++;
                isGroup = false;
            }
        }
        System.out.println(count);
    }
}
