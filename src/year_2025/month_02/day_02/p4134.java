package year_2025.month_02.day_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class p4134 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());
            for (int i = 0; i < repeat; i++) {
                long input = Long.parseLong(br.readLine());
                long primeNum = getNearestPrimeNumber(input);
                bw.write(primeNum + "\n");
            }
        }
    }

    public static long getNearestPrimeNumber (long num) {
        while (true) {
            Set<Long> divisors = new HashSet<>();
            for (long i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    divisors.add(num / i);
                }
                if (divisors.size() > 2) break;
            }

            if (divisors.size() == 2) {
                return num;
            }

            num++;
        }
    }
}
