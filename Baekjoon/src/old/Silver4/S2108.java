package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        int max = -4000;
        int min = 4000;
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        Arrays.sort(arr);
        List<Integer> freq = new ArrayList<>();
        int row = 0;
        int maxRow = 0;
        freq.add(arr[0]);
        for (int i = 1; i < N; i++) {
            row = arr[i] == arr[i - 1] ? row + 1 : 0;
            if (maxRow == row) {
                freq.add(arr[i]);
            } else if (maxRow < row) {
                maxRow = Math.max(maxRow, row);
                freq.clear();
                freq.add(arr[i]);
            }
        }
        Arrays.sort(freq.toArray());

        System.out.println(Math.round(sum / (double)N));
        System.out.println(arr[N/2]);
        System.out.println(freq.size()>=2 ? freq.get(1) : freq.get(0));
        System.out.println(max - min);
    }
}
