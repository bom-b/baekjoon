package year_2025.month_01.day_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p9498 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        String result;
        if (89 < input) {
            result = "A";
        } else if (79 < input) {
            result = "B";
        } else if (69 < input) {
            result = "C";
        } else if (59 < input) {
            result = "D";
        } else {
            result = "F";
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
