package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class p9506 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int input;
            while ((input = Integer.parseInt(br.readLine())) != -1) {
                List<Integer> measures = new ArrayList<>();
                int totalMeasures = 0;
                for (int i = 1; i < input; i++) {
                    if (input % i == 0) {
                        measures.add(i);
                        totalMeasures += i;
                    }
                }

                if (input == totalMeasures) {
                    bw.write(input + " = ");
                    for (int i = 0; i < measures.size(); i++) {
                        bw.write(String.valueOf(measures.get(i)));
                        if (i != measures.size()-1) bw.write(" + ");
                    }
                } else {
                    bw.write(input + " is NOT perfect.");
                }
                bw.newLine();
            }
        }
    }
}
