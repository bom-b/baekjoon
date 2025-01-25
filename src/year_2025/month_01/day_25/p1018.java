package year_2025.month_01.day_25;

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
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            String[] board = new String[N];
            for (int i = 0; i < N; i++) {
                board[i] = br.readLine();
            }

            String whiteStartLine = "WBWBWBWB";
            String blackStartLine = "BWBWBWBW";

            int bestCnt = 64;
            for (int n = 0; n <= N - 8; n++) {
                for (int m = 0; m <= M - 8; m++) {
                    int changeCnt = 0;
                    for (int lineIndex = n; lineIndex < n + 8 ; lineIndex++) {
                        String line = board[lineIndex].substring(m, m + 8);
                        for (int i = 0; i < line.length(); i++) {
                            if(lineIndex % 2 == 0) {
                                if (whiteStartLine.charAt(i) != line.charAt(i)) changeCnt++;
                            } else {
                                if (blackStartLine.charAt(i) != line.charAt(i)) changeCnt++;
                            }
                        }
                    }

                    changeCnt = Math.min((64 - changeCnt), changeCnt);
                    if (changeCnt < bestCnt) bestCnt = changeCnt;
                }

            }

            bw.write(String.valueOf(bestCnt));
        }
    }
}
