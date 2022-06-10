package _14강_정렬I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11650_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int point[][] = new int[n][2];

        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(point, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                    return o1[1] - o2[1];
            }
        });


        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < point.length; i++)
            sb.append(point[i][0]).append(" ").append(point[i][1]).append("\n");
        System.out.println(sb);
    }

}