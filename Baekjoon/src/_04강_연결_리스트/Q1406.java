package _04강_연결_리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list = new LinkedList<>(Arrays.asList(br.readLine().split("")));
        int cursor = list.size();
        int M = Integer.parseInt(br.readLine());
        while(M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch(order) {
                case "L":
                    if(cursor != 0) {
                        cursor--;
                    }
                    break;
                case "D":
                    if(cursor != list.size()) {
                        cursor++;
                    }
                    break;
                case "B":
                    if(cursor != 0) {
                        list.remove(cursor - 1);
                        cursor--;
                    }
                    break;
                case "P":
                    list.add(cursor, st.nextToken());
                    cursor++;
            }
        }
        for(String str : list) {
            sb.append(str);
        }
        System.out.println(sb);
    }
}
