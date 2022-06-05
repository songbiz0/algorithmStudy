package old.Test;

public class ForTest {
    public static void main(String[] args) {
        int count = 20;
        while(count-- > 0) {
            int val = (int)(Math.random() * 100000);
            System.out.println(val);
        }
    }
}
