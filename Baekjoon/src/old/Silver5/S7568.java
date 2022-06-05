package old.Silver5;

import java.util.Scanner;

public class S7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int[] ranks = new int[arr.length];
        for(int i=0; i<ranks.length; i++) {
            ranks[i] = 1;
        }
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt() + " " + sc.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            String a = arr[i].substring(0, arr[i].indexOf(" "));
            String b = arr[i].substring(arr[i].indexOf(" ")+1);
            for(int j=0; j<arr.length; j++) {
                String c = arr[j].substring(0, arr[j].indexOf(" "));
                String d = arr[j].substring(arr[j].indexOf(" ")+1);
                if(a.compareTo(c)<0 && b.compareTo(d)<0) {
                    ranks[i]++;
                }
            }
        }
        for(int num : ranks) {
            System.out.print(num + " ");
        }
    }
}
