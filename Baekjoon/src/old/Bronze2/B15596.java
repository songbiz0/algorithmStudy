package old.Bronze2;

public class B15596 {
    static long sum(int[] a) {
        long sum = 0;
        for(int b : a) {
            sum += b;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(new int[] {1, 3, 5}));
    }
}
