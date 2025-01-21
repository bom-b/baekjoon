package year_2025.month_01.day_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p24265 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            long input = Integer.parseInt(br.readLine());
            bw.write( ((input * input) - input)/2 + "\n2");
        }
    }
}
