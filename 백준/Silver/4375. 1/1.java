import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      String str = br.readLine();
      if(str == null) {
        break;
      }
      int n = Integer.parseInt(str);
      int answer = 1;
      int length = 1;
      while(true) {
        answer = answer % n;
        if(answer == 0) {
          break;
        }
        answer = answer * 10 + 1;
        length++;
      }
      System.out.println(length);
    }
  }
}
