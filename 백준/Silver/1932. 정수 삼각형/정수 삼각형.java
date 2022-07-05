import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<n; i++) {
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            triangle.add(list);
        }

        for(int i=1; i<n; i++) {
            List<Integer> list = triangle.get(i);
            for(int j=0; j<list.size(); j++) {
                int val = list.get(j);
                List<Integer> upperList = triangle.get(i - 1);
                int upperVal;
                if(j == 0) {
                    upperVal = upperList.get(0);
                } else if(j == list.size() - 1) {
                    upperVal = upperList.get(j - 1);
                } else {
                    upperVal = Math.max(upperList.get(j - 1), upperList.get(j));
                }
                list.set(j, val + upperVal);
            }
        }

        List<Integer> result = triangle.get(n - 1);
        Collections.sort(result);
        System.out.println(result.get(result.size() - 1));
    }

}