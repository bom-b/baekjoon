package year_2025.month_02.day_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p17103 {
    static final int MAX = 1000000;
    static boolean[] primeNumbers = new boolean[MAX + 1]; // 소수 = false

    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            makePrimeNumbers();

            int repeat = Integer.parseInt(br.readLine());

            while (repeat-- > 0) {
                int N = Integer.parseInt(br.readLine());
                int cnt = 0;
                for (int i = 2; i <= N / 2; i++) {
                    if (!primeNumbers[i] && !primeNumbers[N - i]) {
                        cnt++;
                    }
                }
                bw.write(cnt + "\n");
            }
        }
    }

    public static void makePrimeNumbers() {
        primeNumbers[0] = primeNumbers[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!primeNumbers[i]) {
                for (int j = i * i; j <= MAX; j+=i) {
                    primeNumbers[j] = true;
                }
            }
        }
    }
}
