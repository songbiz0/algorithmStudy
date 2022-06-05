package old.Silver1;

public class S11729 {
    public static void main(String[] args) {
        hanoi(3, 1, 2, 3);
    }

    public static void hanoi(int N, int a, int b, int c) {
        if(N==1) {
            System.out.println(a + " " + c);
            return;
        }
        hanoi(N-1, a, c, b);
        System.out.println(a + " " + c);
        hanoi(N-1, b, a, c);
    }
}
