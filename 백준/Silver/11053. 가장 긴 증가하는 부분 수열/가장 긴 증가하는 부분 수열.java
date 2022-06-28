import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] seq = new int[N];
		for(int i=0; i<N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[N];
		int max = 1;
		for(int i=0; i<N; i++) {
			dp[i] = 1;
			
			for(int j=i-1; j>=0; j--) {
				int val = dp[j] + 1;
				if(seq[j] < seq[i] && val > dp[i]) {
					dp[i] = val;
					max = Math.max(max, val);
				}
			}
		}
		
		System.out.println(max);
	}

}