package _07강_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5430 {
    static boolean reversed;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            reversed = false;
            String[] p = br.readLine().split("");
            Deque<Integer> deque = new ArrayDeque<>();
            br.readLine();
            String x = br.readLine();
            x = x.replace("[", "").replace("]", "");
            StringTokenizer st = new StringTokenizer(x, ",");
            while(st.hasMoreTokens()) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }
            sb.append(AC(p, deque)).append("\n");
        }
        System.out.println(sb);
    }

    public static String AC(String[] p, Deque<Integer> deque) {
        for(int i=0; i<p.length; i++) {
            switch (p[i]) {
                case "R":
                    reversed = !reversed;
                    break;
                case "D":
                    if (deque.size() == 0) {
                        return "error";
                    }
                    if (reversed) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = deque.size();
        if(reversed) {
            for(int i=0; i<size; i++) {
                sb.append(deque.removeLast()).append(",");
            }
        } else {
            for(int i=0; i<size; i++) {
                sb.append(deque.removeFirst()).append(",");
            }
        }
        if(sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}
