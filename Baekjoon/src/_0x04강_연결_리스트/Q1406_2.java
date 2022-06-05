package _0x04강_연결_리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Q1406_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int M = Integer.parseInt(br.readLine());
        List<String> list = new LinkedList<>(Arrays.asList(N.split("")));

        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()) {
            iter.next();
        }
        while(M-- > 0) {
            String cmd = br.readLine();
            String[] cmdArr = cmd.split(" ");
            switch (cmdArr[0]) {
                case "L":
                    if(iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case "D":
                    if(iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case "B":
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();;
                    }
                    break;
                case "P":
                    iter.add(cmdArr[1]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String str : list) {
            sb.append(str);
        }
        System.out.println(sb);
    }
}
