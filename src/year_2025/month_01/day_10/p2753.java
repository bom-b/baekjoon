package year_2025.month_01.day_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2753 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int result;
        if(input % 4 == 0) {
            if (input % 400 == 0) {
               result = 1;
            } else if (input % 100 == 0 && input % 400 != 0) {
                result = 0;
            } else {
                result = 1;
            }
        } else {
            result = 0;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
