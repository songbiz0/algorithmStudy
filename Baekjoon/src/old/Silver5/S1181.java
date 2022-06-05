package old.Silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next();
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare (String s1, String s2) {
                if(s1.length()>s2.length()) {
                    return 1;
                }
                else if(s1.length()==s2.length() && s1.compareTo(s2)>0) {
                    return 1;
                } else
                    return -1;
            }
        };
        Arrays.sort(arr,comparator);
        String[] rArr = Arrays.stream(arr).distinct().toArray(String[]::new);
        for(String str : rArr) {
            System.out.println(str);
        }

    }
}
