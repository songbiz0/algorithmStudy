import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int cost = Integer.parseInt(br.readLine());

        int[] result = addTime(hour, minute, cost);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] addTime(int hour, int minute, int cost) {
        minute += cost;
        while(minute >= 60) {
            minute -= 60;
            hour++;
        }

        while(hour >= 24) {
            hour -= 24;
        }

        return new int[]{hour, minute};
    }
}