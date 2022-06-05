package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4949U {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String input = br.readLine();
            if(input.equals(".")) {
                break;
            }
            sb.append(isBal(input)).append("\n");
        }
        System.out.println(sb);
    }

    public static String isBal(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(' || c == '[') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if(c == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "yes" : "no";
    }
}
