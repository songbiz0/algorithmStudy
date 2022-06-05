package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<N; i++) {
            String[] arr2 = br.readLine().split(" ");
            switch(arr2[0]) {
                case "push" :
                    arr.add(Integer.parseInt(arr2[1]));
                    break;
                case "pop" :
                    if(arr.size() != 0) {
                        System.out.println(arr.remove(0));
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size" :
                    System.out.println(arr.size());
                    break;
                case "empty" :
                    System.out.println(arr.size() == 0 ? 1 : 0);
                    break;
                case "front" :
                    System.out.println(arr.size() == 0 ? -1 : arr.get(0));
                    break;
                case "back" :
                    System.out.println(arr.size() == 0 ? -1 : arr.get(arr.size()-1));
            }
        }
    }
}