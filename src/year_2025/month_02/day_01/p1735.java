package year_2025.month_02.day_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1735 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int numerator1 = Integer.parseInt(st.nextToken());
            int denominator1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int numerator2 = Integer.parseInt(st.nextToken());
            int denominator2 = Integer.parseInt(st.nextToken());

            int newNumerator = numerator1 * denominator2 + numerator2 * denominator1;
            int newDenominator = denominator1 * denominator2;
            int gcd = getGCD(newNumerator, newDenominator);

            bw.write(newNumerator / gcd + " " + newDenominator / gcd);
        }
    }

    public static int getGCD (int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
