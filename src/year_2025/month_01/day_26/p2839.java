package year_2025.month_01.day_26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2839 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            int cnt = N;

            for (int i = 0; i <= N / 5; i++) {
                int temp = N - i * 5;
                int tempCnt = i;

                if (temp % 3 == 0) {
                    tempCnt += temp / 3;
                    cnt = Math.min(cnt, tempCnt);
                }
            }

            bw.write(cnt == N ? "-1" : String.valueOf(cnt));
        }
    }
}
