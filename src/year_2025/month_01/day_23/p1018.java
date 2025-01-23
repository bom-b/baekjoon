package year_2025.month_01.day_23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1018 {

    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            char [][] board = new char[M][N];
            for (int i = 0; i < M; i++) {
                String line = br.readLine();
                for (int j = 0; j < N; j++) {
                    board[i][j] = line.charAt(j);
                }
            }

        }
    }
}
