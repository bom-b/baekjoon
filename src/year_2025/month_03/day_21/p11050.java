package year_2025.month_03.day_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p11050 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(getFactorial(N) / (getFactorial(N - K) * getFactorial(K))));
        }
    }

    public static int getFactorial(int num) {
        if (num < 1) return 1;
        return num * getFactorial(num - 1);
    }
}
