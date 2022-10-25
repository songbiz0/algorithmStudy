import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<List<Integer>> startTeamList;
    static List<List<Integer>> linkTeamList;
    static int[][] stats;
    static int startScore;
    static int linkScore;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stats = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                stats[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        startTeamList = new ArrayList<>();
        linkTeamList = new ArrayList<>();
        boolean[] visited = new boolean[N];
        addCombination(0, 0, N/2, visited, startTeamList, linkTeamList);

        int min = Integer.MAX_VALUE;
        for(int i=0; i<startTeamList.size(); i++) {
            boolean[] visited2 = new boolean[N/2];
            startScore = 0;
            linkScore = 0;
            getScoreDifference(0, 0, visited2, i);
            min = Math.min(min, Math.abs(startScore - linkScore));
        }

        System.out.println(min);
    }

    static void addCombination(int depth, int start, int end, boolean[] visited, List<List<Integer>> list1, List<List<Integer>> list2) {
        if(depth == end) {
            List<Integer> tempStartTeamList = new ArrayList<>();
            List<Integer> tempLinkTeamList = new ArrayList<>();
            for(int i=0; i<visited.length; i++) {
                if(visited[i]) {
                    tempStartTeamList.add(i);
                } else {
                    tempLinkTeamList.add(i);
                }
            }
            list1.add(tempStartTeamList);
            list2.add(tempLinkTeamList);
            return;
        }

        for(int i=start; i<visited.length; i++) {
            visited[i] = true;
            addCombination(depth + 1, i + 1, end, visited, list1, list2);
            visited[i] = false;
        }
    }

    static void getScoreDifference(int start, int depth, boolean[] visited, int idx) {
        if(depth == 2) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<visited.length; i++) {
                if(visited[i]) {
                    list.add(i);
                }
            }
            int x = list.get(0);
            int y = list.get(1);
            int startX = startTeamList.get(idx).get(x);
            int startY = startTeamList.get(idx).get(y);
            int linkX = linkTeamList.get(idx).get(x);
            int linkY = linkTeamList.get(idx).get(y);
            startScore += stats[startX][startY];
            startScore += stats[startY][startX];
            linkScore += stats[linkX][linkY];
            linkScore += stats[linkY][linkX];
            return;
        }

        for(int i=start; i<visited.length; i++) {
            visited[i] = true;
            getScoreDifference(i + 1, depth + 1, visited, idx);
            visited[i] = false;
        }
    }
}