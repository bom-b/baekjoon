package year_2025.month_01.day_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p5073 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input;
            while (!"0 0 0".equals(input = br.readLine())) {
                StringTokenizer st = new StringTokenizer(input);
                int[] lengths = new int[3];
                lengths[0] = Integer.parseInt(st.nextToken());
                lengths[1] = Integer.parseInt(st.nextToken());
                lengths[2] = Integer.parseInt(st.nextToken());
                Arrays.sort(lengths);

                if (lengths[2] >= lengths[0] + lengths[1]) {
                    bw.write("Invalid");
                } else {
                    if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) {
                        bw.write("Equilateral");
                    } else if (lengths[0] == lengths[1] || lengths[1] == lengths[2] || lengths[0] == lengths[2]) {
                        bw.write("Isosceles");
                    } else {
                        bw.write("Scalene");
                    }
                }
                bw.newLine();
            }
        }
    }
}
