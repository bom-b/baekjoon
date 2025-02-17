package year_2025.month_02.day_17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11866 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            Queue<Integer> circle = new LinkedList<>();
            for (int i = 1; i <= N; i++) circle.add(i);

            bw.write("<");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < K - 1; j++) circle.add(circle.poll());
                bw.write(circle.poll() + ((i != N - 1) ? ", " : ">"));
            }
        }
    }
}

