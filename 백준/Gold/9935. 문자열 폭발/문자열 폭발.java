import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String bomb = br.readLine();

    Stack<Character> stack = new Stack<>();
    for (int i=0; i<str.length(); i++) {
      stack.push(str.charAt(i));
      if (stack.size() >= bomb.length()) {
        boolean isBomb = true;
        for (int j=0; j<bomb.length(); j++) {
          Character c1 = bomb.charAt(bomb.length() - 1 - j);
          Character c2 = stack.get(stack.size() - 1 - j);
          if (!c1.equals(c2)) {
            isBomb = false;
            break;
          }
        }

        if (isBomb) {
          for (int j=0; j<bomb.length(); j++) {
            stack.pop();
          }
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (Character c : stack) {
      sb.append(c);
    }
    System.out.println(sb.toString().equals("") ? "FRULA" : sb);
  }
}
