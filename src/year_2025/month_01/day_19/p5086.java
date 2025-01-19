package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p5086 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input;
            while (!"0 0".equals(input = br.readLine())) {
                StringTokenizer st = new StringTokenizer(input);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (b % a == 0) {
                    bw.write("factor");
                } else if (a % b == 0) {
                    bw.write("multiple");
                } else {
                    bw.write("neither");
                }
                bw.newLine();
            }
        }
    }
}
