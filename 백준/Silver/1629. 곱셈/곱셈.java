import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(cal(A, B, C));
    }

    static long cal(long A, long B, long C) {
        long answer = 0;

        if(B == 0) {
            answer = 1;
        } else {
            long val = cal(A, B / 2, C);

            if(B % 2 == 0) {
                answer = val * val % C;
            } else if(B % 2 != 0) {
                answer = (val * val % C) * A % C;
            }
        }

        return answer;
    }
}