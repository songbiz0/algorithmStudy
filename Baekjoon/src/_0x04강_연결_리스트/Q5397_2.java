package _0x04강_연결_리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q5397_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- > 0) {
            char[] pwArr = br.readLine().toCharArray();
            Stack<Character> a = new Stack<>();
            Stack<Character> b = new Stack<>();

            for(char c : pwArr) {
                switch (c) {
                    case '<':
                        if(!b.empty()) {
                            a.push(b.pop());
                        }
                        break;
                    case '>':
                        if(!a.empty()) {
                            b.push(a.pop());
                        }
                        break;
                    case '-':
                        if(!b.empty()) {
                            b.pop();
                        }
                        break;
                    default:
                        b.push(c);
                }
            }
            while(!a.empty()) {
                b.push(a.pop());
            }

            for(int i=0; i<b.size(); i++) {
                sb.append(b.elementAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
