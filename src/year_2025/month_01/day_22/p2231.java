package year_2025.month_01.day_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2231 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int input = Integer.parseInt(br.readLine());

            int result = 0;
            for (int i = 1; i <= input; i++) {
                int sum = i;
                for (char c : String.valueOf(i).toCharArray()) {
                    sum += Character.getNumericValue(c);
                }
                if (input == sum) {
                    result = i;
                    break;
                }
            }

            bw.write(String.valueOf(result));
        }
    }

}
