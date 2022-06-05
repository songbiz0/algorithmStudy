package concept;

    // 카운팅 정렬
    // 수의 범위가 좁은 경우 시간복잡도가 가장 낮은 정렬 방법
    // 반대로 수열의 길이에 비해 수의 범위가 지나치게 넓은 경우 메모리가 지나치게 낭비됨

public class CountingSort {
    public static void main(String[] args) {

        int[] array = new int[100];   // 수열의 원소 : 100개
        int[] counting = new int[31]; // 수의 범위 : 0 ~ 30
        int[] result = new int[100];  // 정렬 이후 배열

        for(int i=0; i<array.length; i++) {
            array[i] = (int)(Math.random()*31); // 0 ~ 30
        }

        // array의 value 값을 index로 하는 counting 배열 값 1 증가
        for(int i=0; i<array.length; i++) {
            counting[array[i]]++;
        }

        // 누적합
        for(int i=1; i<counting.length; i++) {
            counting[i] += counting[i-1];
        }

        // i번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
        // counting 배열의 값을 인덱스로 하여 result에 value 값을 저장
        for(int i=array.length-1; i>=0; i--) {
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        for(int a : result) {
            System.out.println(a);
        }
    }
}
