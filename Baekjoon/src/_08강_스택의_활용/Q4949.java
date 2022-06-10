package _08강_스택의_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String input = br.readLine();
            if(input.equals(".")) {
                break;
            }
            sb.append(isBalanced(input)).append("\n");
        }
        System.out.println(sb);
    }

    public static String isBalanced(String str) {
        char[] chars = str.toCharArray();
        List<Character> list = new LinkedList<>();
        for(int i=0; i<chars.length; i++) {
            if(chars[i] == '(') {
                list.add('s');
            } else if(chars[i] == '[') {
                list.add('l');
            } else if(chars[i] == ')') {
                try {
                    char c = list.get(list.size()-1);
                    if(c == 's') {
                        list.remove(list.size()-1);
                    } else {
                        return "no";
                    }
                } catch (Exception e) {
                    return "no";
                }
            } else if(chars[i] == ']') {
                try {
                    char c = list.get(list.size()-1);
                    if(c == 'l') {
                        list.remove(list.size()-1);
                    } else {
                        return "no";
                    }
                } catch (Exception e) {
                    return "no";
                }
            }
        }
        return list.size() == 0 ? "yes" : "no";
    }
}
