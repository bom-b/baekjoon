package year_2025.month_02.day_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class p4948 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int input;
            while ((input = Integer.parseInt(br.readLine())) != 0) {
                bw.write(countPrimeNumber(input) + "\n");
            }
        }
    }

    public static int countPrimeNumber (int num) {
        int cnt = 0;
        for (int i = num + 1; i <= 2 * num ; i++) {
            Set<Integer> divisors = new HashSet<>();
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    divisors.add(j);
                    divisors.add(i / j);
                }
                if (divisors.size() > 2) break;
            }
            if (divisors.size() == 2) cnt++;
        }
        return cnt;
    }
}
