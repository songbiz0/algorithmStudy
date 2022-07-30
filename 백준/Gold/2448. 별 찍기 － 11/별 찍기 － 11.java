import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] star = new String[N];
        star[0] = "  *  ";
        star[1] = " * * ";
        star[2] = "*****";

        for(int i=1; 3*Math.pow(2, i)<=N; i++) {
            makeStar(i, star);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            sb.append(star[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void makeStar(int idx, String[] map) {
        int last = 3 * (int)Math.pow(2, idx);
        int middle = last / 2;
        for(int i=middle; i<last; i++) {
            map[i] = map[i-middle] + " " + map[i-middle];
        }
        StringBuilder blank = new StringBuilder();
        blank.append(" ".repeat(Math.max(0, middle)));

        for(int i=0; i<middle; i++) {
            map[i] = blank + map[i] + blank;
        }
    }
}