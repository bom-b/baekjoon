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

        int totalMinute = (hour * 60) + minute + duration;
        int newHour = (totalMinute / 60) % 24;
        int newMinute = totalMinute % 60;

        bw.write(newHour + " " + newMinute);
        bw.flush();
        bw.close();
    }
}
