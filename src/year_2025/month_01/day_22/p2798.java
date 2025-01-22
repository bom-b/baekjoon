package year_2025.month_01.day_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2798 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] cards = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int card = Integer.parseInt(st.nextToken());
                cards[i] = card;
            }

            int bestScore = 0;
            for (int i = 0; i < cards.length; i++) {
                for (int j = 0; j < cards.length; j++) {
                    if (j != i) {
                        for (int k = 0; k < cards.length; k++) {
                            if (k != i && k != j) {
                                int sum = cards[i] + cards[j] + cards[k];
                                if (sum <= M && sum > bestScore)  {
                                    bestScore = sum;
                                }
                            }
                        }
                    }
                }
            }

            bw.write(String.valueOf(bestScore));
        }
    }
}
