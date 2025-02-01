package year_2025.month_01.day_30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class p1620 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            String[] pokemonNames = new String[N];
            Map<String, Integer> pokemonNums = new HashMap<>();
            for (int i = 0; i < N; i++) {
                String pokemonName = br.readLine();
                pokemonNames[i] = pokemonName;
                pokemonNums.put(pokemonName, i + 1);
            }

            for (int i = 0; i < M; i++) {
                String input = br.readLine();
                if (Character.isAlphabetic(input.charAt(0))) {
                    bw.write(pokemonNums.get(input) + "\n");
                } else {
                    bw.write(pokemonNames[Integer.parseInt(input) - 1] + "\n");
                }
            }
        }
    }
}
