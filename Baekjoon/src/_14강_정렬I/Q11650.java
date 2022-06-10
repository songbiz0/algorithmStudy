package _14강_정렬I;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0]) {
                    return 1;
                } else if(o1[0] == o2[0] && o1[1] > o2[1]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
