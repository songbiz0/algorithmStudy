package old.Test;

public class OperatorTest {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while(n1 == n2) {
            a = (int)(Math.random()*10000)+1;
            b = (int)(Math.random()*10000)+1;
            c = (int)(Math.random()*10000)+1;
            n1 = (a % c) * (b % c) % c;
            n2 = ((a % c) * (b % c)) % c;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
