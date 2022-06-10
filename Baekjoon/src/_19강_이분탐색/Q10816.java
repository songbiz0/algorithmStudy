package _19강_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] cards = new int[N];
        for(int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Arrays.sort(cards);

        for(int i=0; i<M; i++) {
            sb.append(search(cards, Integer.parseInt(st.nextToken()))).append(" ");
        }
        System.out.println(sb);
    }

    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > key) {
                high = mid - 1;
            } else if(arr[mid] < key) {
                low = mid + 1;
            } else {
                return close(arr, key, mid);
            }
        }
        return 0;
    }

    public static int close(int[] arr, int key, int mid) {
        int key2 = key;
        int count = 1;
        int idx = mid;
        while(true) {
            try {
                key2 = arr[--idx];
            } catch (Exception e) {
                break;
            }
            if(key2 == key) {
                count++;
            } else {
                break;
            }
        }
        idx = mid;
        while(true) {
            try {
                key2 = arr[++idx];
            } catch (Exception e) {
                break;
            }
            if(key2 == key) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
