package year_2025.month_03.day_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class p20920 {
    public static void solution() throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Map<String, Integer> map = new HashMap<>();
            while (N-- > 0) {
                String input = br.readLine();
                if (input.length() >= M) map.put(input, map.getOrDefault(input, 0) + 1);
            }

            List<String> keySet = new ArrayList<>(map.keySet());
            keySet.sort((o1, o2) -> {
                if (!map.get(o1).equals(map.get(o2))) {
                    return map.get(o2) - map.get(o1);
                } else if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                } else {
                    return o1.compareTo(o2);
                }
            });

            for (String key : keySet) {
                bw.write(key + "\n");
            }
        }
    }

}
