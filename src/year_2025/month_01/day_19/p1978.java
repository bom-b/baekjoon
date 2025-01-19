package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p1978 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            for (int i = 0; i < repeat; i++) {
                int num = Integer.parseInt(st.nextToken());
                List<Integer> measures = getMeasures(num);
                if (num != 1 && measures.size() < 3) count++;
            }

            bw.write(String.valueOf(count));
        }
    }

    public static List<Integer> getMeasures(int num) {
        List<Integer> measures = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) measures.add(i);
        }
        return measures;
    }
}
