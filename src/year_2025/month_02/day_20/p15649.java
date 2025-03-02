package year_2025.month_02.day_20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p15649 {
    public static int[] arr;
    public static boolean[] visit;

    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            arr = new int[M];
            visit = new boolean[N];
            recursion(N, M, 0, bw);
        }
    }

    public static void recursion(int N, int M, int depth, BufferedWriter bw) throws Exception {
        if (depth == M) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                arr[depth] = i + 1;
                visit[i] = true;
                recursion(N, M, depth + 1, bw);
                visit[i] = false;
            }
        }
    }
}
