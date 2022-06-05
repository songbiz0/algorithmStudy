package old.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int number = 0;
            if(!order.equals("all") && !order.equals("empty")) {
                number = Integer.parseInt(st.nextToken());
            }
            switch (order) {
                case "add" :
                    set.add(number);
                    break;
                case "remove" :
                    set.remove(number);
                    break;
                case "check" :
                    sb.append(set.contains(number) ? 1 : 0).append("\n");
                    break;
                case "toggle" :
                    if(set.contains(number)) {
                        set.remove(number);
                    } else {
                        set.add(number);
                    }
                    break;
                case "all" :
                    set = new HashSet<>();
                    for(int i=1; i<=20; i++) {
                        set.add(i);
                    }
                    break;
                case "empty" :
                    set.clear();
            }
        }
        System.out.println(sb);
    }
}
