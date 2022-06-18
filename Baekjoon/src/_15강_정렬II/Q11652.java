package _15강_정렬II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> cards = new HashMap<>();
        while(N-- > 0) {
            long val = Long.parseLong(br.readLine());
            cards.put(val, cards.getOrDefault(val, 0) + 1);
        }

        List<Map.Entry<Long, Integer>> entryList = new LinkedList<>(cards.entrySet());
        entryList.sort((o1, o2) -> {
            if(o1.getValue().equals(o2.getValue())) {
                return Long.compare(o1.getKey(), o2.getKey());
            }
            return Integer.compare(o2.getValue(), o1.getValue());
        });

        System.out.println(entryList.get(0).getKey());
    }
}