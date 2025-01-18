package year_2025.month_01.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2566 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int max = 0;
            int row = 1;
            int col = 1;

            for (int i = 1; i <= 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= 9; j++) {
                    int num = Integer.parseInt(st.nextToken());
                    if (num > max) {
                        max = num;
                        row = i;
                        col = j;
                    }
                }
            }

            bw.write(max + "\n");
            bw.write(row + " " + col);
        }
    }
}
