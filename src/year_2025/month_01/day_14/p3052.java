package year_2025.month_01.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p3052 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> remainders = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            int remainder = input % 42;
            remainders.add(remainder);
        }

        bw.write(String.valueOf(remainders.size()));
        bw.flush();
        bw.close();
    }
}
