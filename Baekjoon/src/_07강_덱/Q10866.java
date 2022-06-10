package _07강_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    List<Integer> temp = new LinkedList<>();
                    temp.add(Integer.parseInt(st.nextToken()));
                    temp.addAll(deque);
                    deque = temp;
                    break;
                case "pop_front":
                    if(deque.size() != 0) {
                        sb.append(deque.remove(deque.size() - 1));
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "pop_back":
                    if(deque.size() != 0) {
                        sb.append(deque.remove(0));
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.size()==0 ? 1 : 0).append("\n");
                    break;
                case "front":
                    if(deque.size() != 0) {
                        sb.append(deque.get(deque.size() - 1));
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "back":
                    if(deque.size() != 0) {
                        sb.append(deque.get(0));
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
