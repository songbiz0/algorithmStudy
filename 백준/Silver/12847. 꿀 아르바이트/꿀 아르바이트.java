import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] wages = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int i = 0;
        int j = 0;
        long sum = 0;
        long max = 0;
        while(j < m - 1) {
            sum += wages[j++];
        }
        while(j < n) {
            sum += wages[j++];
            max = Math.max(sum, max);
            sum -= wages[i++];
        }

        System.out.println(max);
    }
}