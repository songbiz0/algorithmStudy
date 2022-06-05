package old.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S7568U {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] student = new int[N][2];
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            student[i][0] = Integer.parseInt(st.nextToken());
            student[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++) {
            int rank = 1;
            for(int j=0; j<N; j++) {
                if(student[j][0] > student[i][0] && student[j][1] > student[i][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
