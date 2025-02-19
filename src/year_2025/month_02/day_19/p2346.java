package year_2025.month_02.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p2346 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            Deque<int[]> balloons = new ArrayDeque<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                int moveCommand = Integer.parseInt(st.nextToken());
                balloons.offerLast(new int[] {i, moveCommand});
            }

            while (true) {
                bw.write(balloons.peekFirst()[0] + " ");
                int moveCommand = balloons.pollFirst()[1];

                if (!balloons.isEmpty()) {
                    if (moveCommand > 0) {
                        for (int i = 0; i < moveCommand - 1; i++) balloons.offerLast(balloons.pollFirst());
                    } else {
                        for (int i = moveCommand; i <= -1; i++) balloons.offerFirst(balloons.pollLast());
                    }
                } else {
                    break;
                }
            }
        }
    }
}
