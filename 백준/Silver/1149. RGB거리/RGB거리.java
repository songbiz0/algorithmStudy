import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<int[]> fixedCosts;
    static List<int[]> resultCosts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fixedCosts = new ArrayList<>();
        resultCosts = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int[] arr = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            fixedCosts.add(arr);
        }

        resultCosts.add(fixedCosts.get(0));
        for(int i=1; i<N; i++) {
            int R = Math.min(resultCosts.get(i - 1)[1], resultCosts.get(i - 1)[2]) + fixedCosts.get(i)[0];
            int G = Math.min(resultCosts.get(i - 1)[0], resultCosts.get(i - 1)[2]) + fixedCosts.get(i)[1];
            int B = Math.min(resultCosts.get(i - 1)[0], resultCosts.get(i - 1)[1]) + fixedCosts.get(i)[2];
            resultCosts.add(new int[]{R, G, B});
        }

        int[] result = resultCosts.get(N - 1);
        System.out.println(Math.min(Math.min(result[0], result[1]), result[2]));
    }
}