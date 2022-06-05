package old.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G14500 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] paper = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxScore = 0;

        for(int i=0; i<N-3; i++) {
            for(int j=0; j<M; j++) {
                int score = paper[i][j] + paper[i+1][j] + paper[i+2][j] + paper[i+3][j];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M-3; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i][j+2] + paper[i][j+3];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i+1][j] + paper[i+1][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j] + paper[i+1][j] + paper[i+2][j] + paper[i+2][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i][j+2] + paper[i+1][j];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i+1][j+1] + paper[i+2][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i+1][j] + paper[i+1][j+1] + paper[i][j+2] + paper[i+1][j+2];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j+1] + paper[i+1][j+1] + paper[i+2][j] + paper[i+2][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i][j] + paper[i+1][j] + paper[i+1][j+1] + paper[i+1][j+2];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i+1][j] + paper[i+2][j];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i][j+2] + paper[i+1][j+2];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j] + paper[i+1][j] + paper[i+1][j+1] + paper[i+2][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i+1][j] + paper[i+1][j+1] + paper[i][j+1] + paper[i][j+2];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j+1] + paper[i+1][j+1] + paper[i+1][j] + paper[i+2][j];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i+1][j+1] + paper[i+1][j+2];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i+1][j] + paper[i+1][j+1] + paper[i][j+1] + paper[i+1][j+2];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j] + paper[i+1][j] + paper[i+2][j] + paper[i+1][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-2; j++) {
                int score = paper[i][j] + paper[i][j+1] + paper[i][j+2] + paper[i+1][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        for(int i=0; i<N-2; i++) {
            for(int j=0; j<M-1; j++) {
                int score = paper[i][j+1] + paper[i+1][j] + paper[i+1][j+1] + paper[i+2][j+1];
                maxScore = Math.max(maxScore, score);
            }
        }

        System.out.println(maxScore);
    }
}
