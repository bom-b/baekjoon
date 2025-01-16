package year_2025.month_01.day_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2908 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int totalTime = 0;
        for (char alphabet : input.toCharArray()) {
            totalTime += (alphabet == 'Z')?  10 : (alphabet - 65) / 3 + 3;
        }

        bw.write(String.valueOf(totalTime));
        bw.flush();
        bw.close();
    }
}
