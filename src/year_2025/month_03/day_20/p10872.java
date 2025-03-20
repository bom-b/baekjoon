package year_2025.month_03.day_20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10872 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(getFactorial(N)));
        }
    }

    public static int getFactorial(int num) {
        if (num < 1) return 1;
        return num * getFactorial(num - 1);
    }
}
