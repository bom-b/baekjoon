package year_2025.month_01.day_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2439 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lintCnt = Integer.parseInt(br.readLine());

        for (int i = 1; i <= lintCnt; i++) {
            bw.write(" ".repeat(lintCnt - i) + "*".repeat(i) + ((i != lintCnt)? "\n" : ""));
        }

        bw.flush();
        bw.close();
    }
}
