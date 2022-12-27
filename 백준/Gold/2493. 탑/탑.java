import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Stack;
import java.util.StringTokenizer;
class Top {
  int index;
  int height;
  Top(int height, int index) {
    this.index = index;
    this.height = height;
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int max = Integer.MIN_VALUE;
    StringTokenizer st = new StringTokenizer(br.readLine());
    Stack<Top> stack = new Stack<>();
    StringBuffer sb = new StringBuffer();
    int i = 1;
    while(st.hasMoreTokens()) {
      int val = Integer.parseInt(st.nextToken());
      max = Math.max(val, max);
      if (val >= max) {
        sb.append(0).append(" ");
        stack.push(new Top(val, i++));
        continue;
      }

      while(stack.peek().height <= val) {
        stack.pop();
      }
      sb.append(stack.peek().index).append(" ");
      stack.push(new Top(val, i++));
    }
    System.out.println(sb);
  }
}
