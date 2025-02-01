package year_2025.month_01.day_30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p1764 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Set<String> duplicatedPeoples = new HashSet<>();
            Set<String> neverHeardPeoples = new HashSet<>();
            for (int i = 0; i < N; i++) {
                neverHeardPeoples.add(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                String name = br.readLine();
                if (neverHeardPeoples.contains(name)) {
                    duplicatedPeoples.add(name);
                }
            }

            bw.write(duplicatedPeoples.size() + "\n");
            duplicatedPeoples.stream().sorted().forEach(name -> {
                try {
                    bw.write(name + "\n");
                } catch (Exception ignored) {}
            });
        }
    }
}
