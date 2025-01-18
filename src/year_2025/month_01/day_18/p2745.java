package year_2025.month_01.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2745 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeatCnt = Integer.parseInt(br.readLine());

            int[][] canvas = new int[100][100];
            int area = 0;
            for (int i = 0; i < repeatCnt; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int leftStart = Integer.parseInt(st.nextToken());
                int bottomStart = 99 - Integer.parseInt(st.nextToken());
                for (int j = leftStart; j < leftStart + 10; j++) {
                    for (int k = bottomStart; k > bottomStart - 10; k--) {
                        if (canvas[k][j] == 0) {
                            canvas[k][j] = 1;
                            area ++;
                        }
                    }
                }
            }

            bw.write(String.valueOf(area));
        }
    }
}
