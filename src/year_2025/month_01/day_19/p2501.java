package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2501 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int index = 1;
            int result = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    if (index == K) {
                        result = i;
                        break;
                    }
                    index++;
                }
            }

            bw.write(String.valueOf(result));
        }
    }
}
