package year_2025.month_01.day_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10101 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());

            if (a + b + c == 180) {
                if (a == b && b == c) {
                    bw.write("Equilateral");
                } else if (a == b || b == c || a == c) {
                    bw.write("Isosceles");
                } else {
                    bw.write("Scalene");
                }
            } else {
                bw.write("Error");
            }

        }
    }
}
