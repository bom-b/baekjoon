package year_2025.month_01.day_28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p1181 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());
            String[] words = new String[repeat];

            for (int i = 0; i < repeat; i++) {
                words[i] = br.readLine();
            }

            words = Arrays.stream(words).distinct().toArray(String[]::new);
            Arrays.sort(words, (a, b) -> {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                } else {
                    return Integer.compare(a.length(), b.length());
                }
            });

            for (String word : words) {
                bw.write(word + "\n");
            }
        }
    }
}
