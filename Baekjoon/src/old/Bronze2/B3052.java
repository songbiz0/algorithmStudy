package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            int r = Integer.parseInt(br.readLine()) % 42;
            if(!list.contains(r)) {
                list.add(r);
            }
        }
        System.out.println(list.size());
    }
}
