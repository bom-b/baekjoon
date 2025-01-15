package year_2025.month_01.day_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11720 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        int total = 0;
        for (char number : numbers.toCharArray()) {
            total += Character.getNumericValue(number);
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}
