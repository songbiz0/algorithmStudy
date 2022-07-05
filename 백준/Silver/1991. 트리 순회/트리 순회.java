import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Character, char[]> graph;
    static StringBuilder preorderSb;
    static StringBuilder inorderSb;
    static StringBuilder postorderSb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        graph = new HashMap<>();
        preorderSb = new StringBuilder();
        inorderSb = new StringBuilder();
        postorderSb = new StringBuilder();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            graph.put(root, new char[]{left, right});
        }

        search('A');
        StringBuilder answer = new StringBuilder();
        answer.append(preorderSb).append("\n")
                        .append(inorderSb).append("\n")
                        .append(postorderSb);
        System.out.println(answer);
    }

    static void search(char root) {
        char[] arr = graph.get(root);
        preorderSb.append(root);
        if(arr[0] != '.') {
            search(arr[0]);
        }
        inorderSb.append(root);
        if(arr[1] != '.') {
            search(arr[1]);
        }
        postorderSb.append(root);
    }
}