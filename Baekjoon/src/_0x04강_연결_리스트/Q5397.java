package _0x04강_연결_리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- > 0) {
            List<String> pwList = new LinkedList<>(Arrays.asList(br.readLine().split("")));
            List<String> newPwList = new LinkedList<>();
            ListIterator<String> iter = newPwList.listIterator();

            for(String str : pwList) {
                switch (str) {
                    case "<":
                        if(iter.hasPrevious()) {
                            iter.previous();
                        }
                        break;
                    case ">":
                        if(iter.hasNext()) {
                            iter.next();
                        }
                        break;
                    case "-":
                        if(iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    default:
                        iter.add(str);
                }
            }

            for(String str : newPwList) {
                sb.append(str);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
