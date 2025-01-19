package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1193 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int findLocation = Integer.parseInt(br.readLine());
            int minNumOfRange = 1;
            int maxNumOfRange = 1;
            int range = 1;
            while (findLocation > maxNumOfRange) {
                minNumOfRange = maxNumOfRange + 1;
                maxNumOfRange += range + 1;
                range ++;
            }

            int total = range + 1;
            int numerator;
            int denominator;
            if (range % 2 == 0) {
                numerator = range - (maxNumOfRange - findLocation);
            } else {
                numerator = range - (findLocation - minNumOfRange);
            }
            denominator = total - numerator;

            bw.write(numerator + "/" + denominator);
        }
    }
}
