package year_2025.month_03.day_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class p11047 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            Integer[] coins = new Integer[N];
            for (int i = 0; i < N; i++) {
                coins[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(coins, Collections.reverseOrder());

            int count = 0;
            for (int coin : coins) {
                count += K / coin;
                K %= coin;
            }

            bw.write(String.valueOf(count));
        }
    }
}
