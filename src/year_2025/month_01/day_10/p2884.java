package year_2025.month_01.day_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2884 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int newHour = hour;
        int newMinute;

        if (minute >= 45) {
            newMinute = minute - 45;
        } else if (hour != 0) {
            newHour = hour - 1;
            newMinute = minute + 15;
        } else {
            newHour = 23;
            newMinute = minute + 15;
        }

        bw.write(newHour + " " + newMinute);
        bw.flush();
        bw.close();
    }
}
