package year_2025.month_02.day_28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2693 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] arr = new int[10];
                for (int i = 0; i < 10; i++) {
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(arr);
                bw.write(arr[7] + "\n");
            }
        }
    }
}
