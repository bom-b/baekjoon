package year_2025.month_02.day_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p1934 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());
            for (int i = 0; i < repeat; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                List<Integer> quotients = new ArrayList<>();
                boolean stop = false;
                while (!stop) {
                    for (int j = Math.max(A, B); j > 0; j--) {
                        if (j == 1) stop = true;
                        if (A % j == 0 && B % j == 0) {
                            quotients.add(j);
                            A /= j;
                            B /= j;
                            break;
                        }
                    }
                }

                int res = A * B;
                for (int quotient : quotients) {
                    res *= quotient;
                }
                bw.write(res + "\n");
            }
        }
    }
}
