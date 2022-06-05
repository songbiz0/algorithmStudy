package old.Silver4;

import java.io.*;
import java.util.Arrays;

public class S1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] B = br.readLine().split(" ");
        br.close();

        Arrays.sort(A);

        for(int i=0; i<M; i++) {
            if(isContains(B[i], A)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean isContains(String str, String[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = (end+start)/2;
            if(str.equals(arr[mid])) {
                return true;
            } else if(Integer.parseInt(str)>Integer.parseInt(arr[mid])) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
}
