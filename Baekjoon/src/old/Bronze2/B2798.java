package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] cardsStr = br.readLine().split(" ");
        int[] cards = new int[N];
        for(int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(cardsStr[i]);
        }
        int max = 0;
            for(int i=0; i<cards.length; i++) {
                for(int j=0; j<cards.length; j++) {
                    for(int k=0; k<cards.length; k++) {
                        if(i != j && i != k && j != k) {
                            int sum = cards[i] + cards[j] + cards[k];
                            if(sum == M) {
                                System.out.println(M);
                                return;
                            }
                            if(sum > max && sum < M) {
                                max = sum;
                            }
                        }
                    }
                }
            }
        System.out.println(max);
    }
}
