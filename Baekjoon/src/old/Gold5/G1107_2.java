package old.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class G1107_2 {
    static List<Integer> broken;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        broken = new ArrayList<>();
        if(M > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<M; i++) {
                broken.add(Integer.parseInt(st.nextToken()));
            }
        }
        int hundDiffer = Math.abs(N-100);
        int count = Integer.MAX_VALUE;
        for(int i=0; i<=1000000; i++) {
            if(isBroken(i) < Integer.MAX_VALUE) {
                count = Math.min(Math.abs(i - N) + isBroken(i), count);
            }
        }
        System.out.println(Math.min(hundDiffer, count));
    }

    public static int isBroken(int num) {
        int count = 0;
        do {
            int val = num % 10;
            if(broken.contains(val)) {
                return Integer.MAX_VALUE;
            }
            num /= 10;
            count++;
        } while(num != 0);
        return count;
    }
}
