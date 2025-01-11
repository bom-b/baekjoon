package year_2025.month_01.day_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2480 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result;
        if (a == b && b == c) {
           result = 10000 + a * 1000;
        } else if (a == b || b == c || a == c) {
            int sameNumber;
            if (a == b || a == c) {
                sameNumber = a;
            } else {
                sameNumber = b;
            }
            result = 1000 + sameNumber * 100;
        } else {
            int biggestNumer = Math.max(Math.max(a,b), c);
            result = biggestNumer * 100;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
