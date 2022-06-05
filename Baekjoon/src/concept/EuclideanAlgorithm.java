package concept;

    // 유클리드 호제법 : 최대공약수와 최소공배수 빠르게 구하기

public class EuclideanAlgorithm {

    // a와 b의 최대공약수
    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // a와 b의 최소공배수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
