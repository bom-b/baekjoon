package year_2025.month_01.day_27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11650 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());
            int[][] coordinates = new int[repeat][2];
            for (int i = 0; i < repeat; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                coordinates[i][0] = Integer.parseInt(st.nextToken());
                coordinates[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(coordinates, (a, b) -> {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                } else {
                    return Integer.compare(a[0], b[0]);
                }
            });

            for (int[] coordinate : coordinates) {
                bw.write(coordinate[0] + " " + coordinate[1] + "\n");
            }
        }
    }
}
