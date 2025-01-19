package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2292 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int destination = Integer.parseInt(br.readLine());
            int section = 1;

            int moveCnt = 1;
            while (section < destination) {
                section += 6 * moveCnt;
                moveCnt++;
            }

            bw.write(String.valueOf(moveCnt));
        }
    }
}
