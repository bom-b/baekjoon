package year_2025.month_01.day_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;

public class p10818 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer line2 = new StringTokenizer(br.readLine());
        while (line2.hasMoreTokens()) {
            int num = Integer.parseInt(line2.nextToken());
            min = Integer.min(min, num);
            max = Integer.max(max, num);
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
