package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        char[][] star = new char[N][N];
        for(int i=0; i<star.length; i++) {
            Arrays.fill(star[i], '*');
        }
        star = makeStar(star);
        for (char[] stars : star) {
            for (char a : stars) {
                sb.append(a);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static char[][] makeStar(char[][] star) {
        for(int i=star.length/3; i<star.length*2/3; i++) {
            for(int j=star[i].length/3; j<star[i].length*2/3; j++) {
                star[i][j] = ' ';
            }
        }
        return star.length==3 ? star : makeStar(star);
    }
}
