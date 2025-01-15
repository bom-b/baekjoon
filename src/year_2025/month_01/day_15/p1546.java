package year_2025.month_01.day_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1546 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int subjectCnt = Integer.parseInt(br.readLine());
        int[] subjectScores = new int[subjectCnt];
        double bestScore = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < subjectCnt; i++) {
            int score = Integer.parseInt(st.nextToken());
            subjectScores[i] = score;
            if (score > bestScore) {
                bestScore = score;
            }
        }

        double totalScore = 0;
        for (int i = 0; i < subjectCnt; i++) {
            double newScore = subjectScores[i] / bestScore * 100;
            totalScore += newScore;
        }

        bw.write(String.valueOf(totalScore / subjectCnt));
        bw.flush();
        bw.close();
    }
}
