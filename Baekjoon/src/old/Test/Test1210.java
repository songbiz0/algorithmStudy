package old.Test;

public class Test1210 {
    public static void main(String[] args) {
        System.out.println(solu(6));
        System.out.println(solu(16));
        System.out.println(solu(626331));
    }

    public static int solu(int num) {
        int count = 0;
        long a = num;
        while(a != 1) {
            if(a % 2 == 0) {
                a /= 2;
            } else {
                a *= 3;
                a++;
            }
            count++;
            if(count >= 500) {
                return -1;
            }
        }
        return count;
    }
}
