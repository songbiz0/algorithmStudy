package _05강_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int idx = 1;
        int listIdx = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        while(idx <= n) {
            if(!stack.empty() && stack.peek().intValue() == list.get(listIdx).intValue()) {
                stack.pop();
                listIdx++;
                sb.append("-\n");
            } else {
                stack.push(idx++);
                sb.append("+\n");
            }
        }
        while(!stack.empty()) {
            if(stack.peek().intValue() == list.get(listIdx).intValue()) {
                stack.pop();
                listIdx++;
                sb.append("-\n");
            } else {
                System.out.print("NO");
                return;
            }
        }
        System.out.print(sb);
    }
}
