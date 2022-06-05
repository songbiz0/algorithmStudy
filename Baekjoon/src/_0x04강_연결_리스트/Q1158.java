package _0x04강_연결_리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;
        List<Integer> arr = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            arr.add(i);
        }
        List<Integer> newArr = new LinkedList<>();
        int idx = 0;
        while(arr.size() != 0) {
            idx += K;
            if(idx >= arr.size()) {
                while(idx >= arr.size()) {
                    idx -= arr.size();
                }
            }
            newArr.add(arr.remove(idx));
        }
        System.out.print("<");
        for(int i=0; i<newArr.size()-1; i++) {
            System.out.printf("%d, ", newArr.get(i));
        }
        System.out.print(newArr.get(N-1));
        System.out.print(">");
    }
}
