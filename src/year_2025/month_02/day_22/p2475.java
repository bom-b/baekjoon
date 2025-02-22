package year_2025.month_02.day_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2475 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int total = 0;
            for (int i = 0; i < 5; i++) {
                int num = Integer.parseInt(st.nextToken());
                total += num * num;
            }

            bw.write(String.valueOf(total % 10));
        }
    }
}
