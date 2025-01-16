package year_2025.month_01.day_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p3003 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] answers = {1, 1, 2, 2, 2, 8};
        StringTokenizer input = new StringTokenizer(br.readLine());

        for (int answer : answers) {
            int cnt = Integer.parseInt(input.nextToken());
            bw.write(answer - cnt + " ");
        }

        bw.flush();
        bw.close();
    }
}
