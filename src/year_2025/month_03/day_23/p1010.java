package year_2025.month_03.day_23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p1010 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int T = Integer.parseInt(br.readLine());
            while(T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                bw.write(getFactorial(M).divide(getFactorial(M - N).multiply(getFactorial(N))) + "\n");
            }
        }
    }

    public static BigInteger getFactorial(int num) {
        if (num < 1) return BigInteger.ONE;
        return BigInteger.valueOf(num).multiply(getFactorial(num - 1));
    }
}
