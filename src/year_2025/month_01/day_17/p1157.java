package year_2025.month_01.day_17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class p1157 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = br.readLine().toUpperCase();
            Map<Character, Integer> frequencies = new HashMap<>();

            for (char alphabet : input.toCharArray()) {
                frequencies.put(alphabet, frequencies.getOrDefault(alphabet, 0) + 1);
            }

            char mostFrequentChar = 'A';
            int maxCount = 0;
            for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostFrequentChar = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
                if (entry.getKey() != mostFrequentChar && entry.getValue() == maxCount) {
                    mostFrequentChar = '?';
                    break;
                }
            }

            bw.write(String.valueOf(mostFrequentChar));
        }
    }
}
