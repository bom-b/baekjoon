package year_2025.month_01.day_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10871 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer line1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(line1.nextToken());
        int x = Integer.parseInt(line1.nextToken());

        StringTokenizer line2 = new StringTokenizer(br.readLine());
        while (line2.hasMoreTokens()) {
            int num = Integer.parseInt(line2.nextToken());
            if (num < x) bw.write(num + " ");
        }

        bw.flush();
        bw.close();
    }
}
