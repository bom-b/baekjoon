package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2720 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int testCase = Integer.parseInt(br.readLine());
            for (int i = 0; i < testCase; i++) {
                int total = Integer.parseInt(br.readLine());

                int quarter = total / 25;
                total -= quarter * 25;
                int dime = total / 10;
                total -= dime * 10;
                int nickel = total / 5;
                total -= nickel * 5;
                int penny = total;

                bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
            }
        }
    }
}
