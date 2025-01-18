package year_2025.month_01.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p25206 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            double totalScore = 0;
            double totalTime = 0;

            String input;
            while ((input = br.readLine()) != null && !input.isEmpty()) {
                StringTokenizer st = new StringTokenizer(input);

                String subject = st.nextToken();
                double time = Double.parseDouble(st.nextToken());
                String grade = st.nextToken();

                switch (grade) {
                    case "A+": totalScore += 4.5 * time; totalTime+= time; break;
                    case "A0": totalScore += 4.0 * time; totalTime+= time; break;
                    case "B+": totalScore += 3.5 * time; totalTime+= time; break;
                    case "B0": totalScore += 3.0 * time; totalTime+= time; break;
                    case "C+": totalScore += 2.5 * time; totalTime+= time; break;
                    case "C0": totalScore += 2.0 * time; totalTime+= time; break;
                    case "D+": totalScore += 1.5 * time; totalTime+= time; break;
                    case "D0": totalScore += time; totalTime+= time; break;
                    case "F": totalTime+= time; break;
                }
            }

            bw.write(String.valueOf(totalScore / totalTime));
        }
    }
}
