package old.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class G1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<Integer> broken = new ArrayList<>();
        if(M > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<M; i++) {
                broken.add(Integer.parseInt(st.nextToken()));
            }
        }
        Stack<Integer> stack = new Stack<>();
        int temp = N;
        while(temp > 0) {
            stack.push(temp % 10);
            temp /= 10;
        }
        int channel = 0;
        boolean cor = true;
        boolean high = false;
        int digit = (int)Math.pow(10, stack.size() - 1);
        int size = stack.size();
        while(!stack.empty()) {
            int val = stack.pop();
            if(cor) {
                if(broken.contains(val)) {
                    cor = false;
                    int minDiffer = 10;
                    int minIdx = -1;
                    for(int i=0; i<10; i++) {
                        if(broken.contains(i)) {
                            continue;
                        }
                        int differ = Math.abs(val - i);
                        if(differ < minDiffer) {
                            minDiffer = differ;
                            minIdx = i;
                        }
                    }
                    channel += minIdx * digit;
                    high = minIdx - val > 0;
                } else {
                    channel += val * digit;
                }
            } else {
                if(high) {
                    for(int i=0; i<10; i++) {
                        if(!broken.contains(i)) {
                            channel += i * digit;
                            break;
                        }
                    }
                } else {
                    for(int i=9; i>=0; i--) {
                        if(!broken.contains(i)) {
                            channel += i * digit;
                            break;
                        }
                    }
                }
            }
            digit /= 10;
        }
        int result = Math.min(Math.abs(channel - N) + size, Math.abs(100 - N));
        System.out.println(result);
    }
}
