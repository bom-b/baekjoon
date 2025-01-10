package year_2025.month_01.day_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2525 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int duration = Integer.parseInt(br.readLine());

        int newHour = hour;
        int newMinute;

        if (minute + duration < 60) {
            newMinute = minute + duration;
        } else {
            if (hour == 23) {
                newHour = 0;
            } else {
                newHour = hour + 1;
            }
            newMinute = minute + duration - 60;
        }

        if (newMinute > 59) {
            newMinute = newMinute % 60;
            int leftHour = newMinute / 60;
            if (newHour)
        }

        bw.write(newHour + " " + newMinute);
        bw.flush();
        bw.close();
    }
}
