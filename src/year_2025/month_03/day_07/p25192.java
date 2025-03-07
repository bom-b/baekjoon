package year_2025.month_03.day_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class p25192 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());

            int total = 0;
            Set<String> friends = new HashSet<>();
            while (N-- > 0) {
                String input = br.readLine();
                if (input.equals("ENTER")) {
                    total += friends.size();
                    friends.clear();
                } else {
                    friends.add(input);
                }
                if (N == 0) total += friends.size();
            }

            bw.write(String.valueOf(total));
        }
    }
}
