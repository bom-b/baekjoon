package year_2025.month_01.day_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10807 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetNumber = Integer.parseInt(br.readLine());

        int matchCase = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == targetNumber) matchCase ++;
        }

        bw.write(String.valueOf(matchCase));
        bw.flush();
        bw.close();
    }
}
