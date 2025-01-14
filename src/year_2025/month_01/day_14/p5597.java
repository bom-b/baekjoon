package year_2025.month_01.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p5597 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[30];
        Arrays.setAll(students, i -> i + 1);

        for (int i = 0; i < 28; i++) {
            int goodStudent = Integer.parseInt(br.readLine());
            students[goodStudent - 1] = 0;
        }

        int minBadStudentNum = 30;
        int maxBadStudentNum = 0;
        for (int student : students) {
            if (student != 0) {
                if (student < minBadStudentNum) {
                    minBadStudentNum = student;
                }
                if (student > maxBadStudentNum) {
                    maxBadStudentNum = student;
                }
            }
        }
        bw.write(minBadStudentNum + "\n" + maxBadStudentNum);
        bw.flush();
        bw.close();
    }
}
