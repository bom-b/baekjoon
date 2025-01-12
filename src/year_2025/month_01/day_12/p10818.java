package year_2025.month_01.day_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10818 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());

        int min = 1000000;
        int max = -1000000;

        StringTokenizer line2 = new StringTokenizer(br.readLine());
        while (line2.hasMoreTokens()) {
            int num = Integer.parseInt(line2.nextToken());
            if (num <= min) {
                min = num;
            } else if (num >= max) {
                max = num;
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
