package year_2025.month_01.day_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2444 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int input = Integer.parseInt(br.readLine());
            int repeatCnt = input * 2 - 1;

            for (int i = 1; i <= repeatCnt; i++) {
                int space = Math.abs(input - i);
                int stars = repeatCnt - 2 * space;
                bw.write(" ".repeat(space) + "*".repeat(stars) + "\n");
            }

            bw.flush();
        }
    }
}
