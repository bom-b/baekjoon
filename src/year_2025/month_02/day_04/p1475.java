package year_2025.month_02.day_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class p1475 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            Map<Character, Integer> numSet = new HashMap<>();
            String input = br.readLine();

            for (char num : input.toCharArray()) {
                numSet.compute(num, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
            }

            int cntOf6 = numSet.getOrDefault('6', 0);
            int cntOf9 = numSet.getOrDefault('9', 0);
            numSet.remove('6');
            numSet.remove('9');
            numSet.put('J', (int) Math.ceil((double) (cntOf6 + cntOf9) / 2));

            int max = 0;
            for (int cnt : numSet.values()) {
                if (cnt > max) max = cnt;
            }

            bw.write(String.valueOf(max));
        }
    }
}
