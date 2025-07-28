package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mentoring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] tests = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                tests[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;

                boolean isValid = true;

                for (int k = 0; k < m; k++) {
                    int mentorRank = 0, menteeRank = 0;

                    for (int s = 0; s < n; s++) {
                        if (tests[k][s] == i) mentorRank = s;
                        if (tests[k][s] == j) menteeRank = s;
                    }

                    if (mentorRank >= menteeRank) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) count++;
            }
        }

        System.out.println(count);
    }
}
