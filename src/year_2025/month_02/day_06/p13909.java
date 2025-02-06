package year_2025.month_02.day_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p13909 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());

            int openedWindowCnt = 0;
            int nextGap = 0;
            for (int i = 1; i <= N; i+=nextGap + 1) {
                openedWindowCnt++;
                nextGap+=2;
            }

            bw.write(String.valueOf(openedWindowCnt));
        }
    }
}
