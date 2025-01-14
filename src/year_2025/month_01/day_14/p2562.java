package year_2025.month_01.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2562 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int biggestNum = 0;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > biggestNum) {
                biggestNum = num;
                index = i;
            }
        }

        bw.write(biggestNum + "\n" + index);
        bw.flush();
        bw.close();
    }
}
