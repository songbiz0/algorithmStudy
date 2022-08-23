import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i : chess) {
            sb.append(i - Integer.parseInt(st.nextToken())).append(' ');
        }

        System.out.println(sb);
    }
}