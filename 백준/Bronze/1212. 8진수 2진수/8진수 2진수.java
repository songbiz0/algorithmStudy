import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringBuilder sb = new StringBuilder();

        if(n.equals("0")) {
            System.out.println(0);
            return;
        }

        String[] arr = new String[]{"000", "001", "010", "011", "100", "101", "110", "111"};

        for(int i=0; i<n.length(); i++) {
            int val = n.charAt(i) - '0';
            sb.append(arr[val]);
        }
        String answer = sb.toString();
        while (answer.charAt(0) == '0') {
            answer = answer.replaceFirst("0", "");
        }
        System.out.println(answer);
    }
}
