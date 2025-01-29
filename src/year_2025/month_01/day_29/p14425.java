package year_2025.month_01.day_29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p14425 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Set<String> S = new HashSet<>();
            for (int i = 0; i < N; i++) {
                S.add(br.readLine());
            }

            int containsCnt = 0;
            for (int i = 0; i < M; i++) {
                if (S.contains(br.readLine())) containsCnt++;
            }

            bw.write(String.valueOf(containsCnt));
        }
    }
}
