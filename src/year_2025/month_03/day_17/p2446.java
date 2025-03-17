package year_2025.month_03.day_17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2446 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                bw.write(" ".repeat(i) + "*".repeat((N * 2 - 1) - (i * 2)) + "\n");
            }
            for (int i = N - 2; i >= 0; i--) {
                bw.write(" ".repeat(i) + "*".repeat((N * 2 - 1) - (i * 2)) + "\n");
            }

        }
    }

}
