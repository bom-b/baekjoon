package year_2025.month_01.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2738 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer problem = new StringTokenizer(br.readLine());
            int rows = Integer.parseInt(problem.nextToken());
            int columns = Integer.parseInt(problem.nextToken());

            int[][] arrA = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                StringTokenizer row = new StringTokenizer(br.readLine());
                for (int j = 0; j < columns; j++) {
                    arrA[i][j] = Integer.parseInt(row.nextToken());
                }
            }

            for (int i = 0; i < rows; i++) {
                StringTokenizer row = new StringTokenizer(br.readLine());
                for (int j = 0; j < columns; j++) {
                    bw.write(arrA[i][j] + Integer.parseInt(row.nextToken()) + " ");
                }
                bw.newLine();
            }
        }
    }
}
