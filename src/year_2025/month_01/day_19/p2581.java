package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class p2581 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int start = Integer.parseInt(br.readLine());
            int end = Integer.parseInt(br.readLine());

            int total = 0;
            int minVal = 0;

            for (int i = start; i <= end; i++) {
                List<Integer> measures = getMeasures(i);
                if (i != 1 && measures.size() < 3) {
                    total += i;
                    if (minVal == 0) minVal = i;
                }
            }

            if (total > 0) {
                bw.write(total + "\n");
                bw.write(String.valueOf(minVal));
            } else {
                bw.write("-1");
            }
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
