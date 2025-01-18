package year_2025.month_01.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10798 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            char[][] arr = new char[5][15];
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < 5; i++) {
                String input = br.readLine();
                for (int j = 0; j < input.length(); j++) {
                    arr[i][j] = input.charAt(j);
                }
            }
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 5; j++) {
                    char ch = arr[j][i];
                    if (ch != '\0') {
                        result.append(ch);
                    }
                }
            }

            bw.write(result.toString());
        }
    }
}
