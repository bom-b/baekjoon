package year_2025.month_03.day_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p24416 {
    public static int repeatCnt = 0;

    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            fibonacci(n);

            bw.write(repeatCnt + " " + (n - 2));
        }
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            repeatCnt++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
