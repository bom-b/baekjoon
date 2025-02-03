package year_2025.month_02.day_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p1929 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            for (int i = M ; i <= N ; i++) {
                if (i != 1 && checkPrimeNumber(i)) bw.write(i + "\n");
            }

        }
    }

    public static boolean checkPrimeNumber (long num) {
        Set<Long> divisors = new HashSet<>();
        for (long i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                divisors.add(num / i);
            }
            if (divisors.size() > 2) return false;
        }

        return true;
    }
}
