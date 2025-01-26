package year_2025.month_01.day_26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1436 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            int result = 666;
            int tryCnt = 0;
            while (true) {
                if (String.valueOf(result).contains("666")) {
                    tryCnt++;
                    if (tryCnt == N) {
                        break;
                    }
                }
                result++;
            }

            bw.write(String.valueOf(result));
        }
    }
}
