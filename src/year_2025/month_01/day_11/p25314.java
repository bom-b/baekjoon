package year_2025.month_01.day_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p25314 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        result.append("long ".repeat(input / 4));
        result.append("int");

        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}
