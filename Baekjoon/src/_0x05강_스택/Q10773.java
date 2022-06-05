package _0x05강_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<K; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a == 0) {
                list.remove(list.size()-1);
            } else {
                list.add(a);
            }
        }
        int sum = 0;
        for(int b : list) {
            sum += b;
        }
        System.out.println(sum);
    }
}
