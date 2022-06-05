package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer, String> pokemonsIntStr = new HashMap<>();
        Map<String, Integer> pokemonsStrInt = new HashMap<>();
        for(int i=0; i<N; i++) {
            String pokemon = br.readLine();
            pokemonsIntStr.put(i, pokemon);
            pokemonsStrInt.put(pokemon, i);
        }
        for(int i=0; i<M; i++) {
            String str = br.readLine();
            try {
                int val = Integer.parseInt(str);
                sb.append(pokemonsIntStr.get(val-1)).append("\n");
            } catch (Exception e) {
                sb.append(pokemonsStrInt.get(str)+1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
