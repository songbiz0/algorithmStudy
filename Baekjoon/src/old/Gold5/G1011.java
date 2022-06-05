package old.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            long answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());
            long distance = y - x;
            long sqrt = (long)Math.floor(Math.sqrt(distance));
            long differ = (long)Math.pow(sqrt+1, 2) - (long)Math.pow(sqrt, 2);
            if(distance == Math.pow(sqrt, 2)) {
                System.out.println(sqrt * 2 - 1);
            } else if(distance < (long)Math.pow(sqrt, 2) + differ / 2.0) {
                System.out.println(sqrt *2);
            } else {
                System.out.println(sqrt * 2 + 1);
            }
        }
    }
}
