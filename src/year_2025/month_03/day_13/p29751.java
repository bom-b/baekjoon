package year_2025.month_03.day_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p29751 {
    public static void solution() throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(W * H / 2.0));
        }
    }

}
