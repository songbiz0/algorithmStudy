package _06강_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int lastValue = 100001;
        while(N-- > 0) {
            String[] cmdArr = br.readLine().split(" ");
            switch (cmdArr[0]) {
                case "push":
                    int val = Integer.parseInt(cmdArr[1]);
                    q.offer(val);
                    lastValue = val;
                    break;
                case "pop":
                    if(q.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(q.poll());
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if(q.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(q.peek());
                    }
                    sb.append("\n");
                    break;
                case "back":
                    if(q.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(lastValue);
                    }
                    sb.append("\n");
                    break;
                default:
            }
        }

        System.out.println(sb);
    }
}
