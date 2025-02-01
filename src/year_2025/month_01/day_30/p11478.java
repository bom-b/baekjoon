package year_2025.month_01.day_30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class p11478 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = br.readLine();
            Set<String> strings = new HashSet<>();

            for (int i = input.length(); i > 0; i--) {
                for (int j = input.length() - i; j >= 0; j--) {
                    strings.add(input.substring(j, j + i));
                }
            }

            bw.write(String.valueOf(strings.size()));
        }
    }
}
