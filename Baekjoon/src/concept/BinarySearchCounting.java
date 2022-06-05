package concept;

    // 이분 탐색 + 개수 찾기

public class BinarySearchCounting {

    public static int lower(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while(low < high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= key) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return low;
    }

    public static int upper(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while(low < high) {
            int mid = (low + high) / 2;
            if(arr[mid] > key) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
