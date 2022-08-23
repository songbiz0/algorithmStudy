import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int count = 0;
            for(int i=1; i<=a; i++) {
                for(int j=1; j<=b; j++) {
                    for(int k=1; k<=c; k++) {
                        if(i % j == j % k && j % k == k % i) {
                            count++;
                        }
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}