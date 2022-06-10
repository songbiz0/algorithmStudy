package _07강_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine().split(" ")[0]);
        for(int i=1; i<=N; i++) {
            deque.add(i);
        }
        String[] targetArr = br.readLine().split(" ");

        int count = 0;
        for(String str : targetArr) {
            int target = Integer.parseInt(str);
            int targetIdx = deque.indexOf(target);
            int halfIdx;
            if(deque.size() % 2 == 0) {
                halfIdx = deque.size() / 2;
            } else {
                halfIdx = (deque.size() - 1) / 2;
            }

            if(halfIdx >= targetIdx) {
                for(int i=0; i<targetIdx; i++) {
                    deque.offerLast(deque.removeFirst());
                }
                count += targetIdx;
                deque.removeFirst();
            } else {
                for(int i=0; i<deque.size() - targetIdx; i++) {
                    deque.offerFirst(deque.removeLast());
                }
                count += deque.size() - targetIdx;
                deque.removeFirst();
            }
        }
        System.out.println(count);
    }
}
