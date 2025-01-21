package year_2025.month_01.day_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p14215 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] lengths = new int[3];
            lengths[0] = Integer.parseInt(st.nextToken());
            lengths[1] = Integer.parseInt(st.nextToken());
            lengths[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(lengths);

            if (lengths[2] >= lengths[0] + lengths[1]) {
                lengths[2] = lengths[0] + lengths[1] - 1;
            }

            bw.write(String.valueOf(lengths[0] + lengths[1] + lengths[2]));
        }
    }
}
