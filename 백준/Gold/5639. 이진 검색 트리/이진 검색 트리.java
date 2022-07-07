import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, int[]> nodes;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        String val;
        while((val = br.readLine()) != null) {
            list.add(Integer.parseInt(val));
        }
        int root = list.get(0);

        nodes = new HashMap<>();
        makeTree(list);

        visited = new boolean[1000000];
        sb = new StringBuilder();

        postOrder(root);
        System.out.println(sb);
    }

    static void makeTree(List<Integer> list) {
        int root = list.remove(0);
        int left = -1;
        int right = -1;
        int rightIdx = 0;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) < root) {
                left = list.get(i);
                break;
            }
        }
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > root) {
                right = list.get(i);
                rightIdx = i;
                break;
            }
        }
        nodes.put(root, new int[]{left, right});

        if(list.size() >= 1) {
            if(rightIdx == 0) {
                makeTree(list);
            } else {
                List<Integer> leftList = new ArrayList<>();
                List<Integer> rightList = new ArrayList<>();

                for(int i=0; i<rightIdx; i++) {
                    leftList.add(list.get(i));
                }
                for(int i=rightIdx; i<list.size(); i++) {
                    rightList.add(list.get(i));
                }

                makeTree(leftList);
                makeTree(rightList);
            }
        }
    }

    static void postOrder(int idx) {
        if(visited[idx]) {
            return;
        }
        visited[idx] = true;

        int[] node = nodes.get(idx);
        if(node[0] != -1) {
            postOrder(node[0]);
        }
        if(node[1] != -1) {
            postOrder(node[1]);
        }

        sb.append(idx).append("\n");
    }
}