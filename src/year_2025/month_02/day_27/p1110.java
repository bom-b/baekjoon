package year_2025.month_02.day_27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1110 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String N = br.readLine();
            if (N.length() == 1) N = "0" + N;

            String newNum = N;
            int cnt = 0;
            while (true) {
                int a = Integer.parseInt(newNum.substring(0, 1));
                int b = Integer.parseInt(newNum.substring(1, 2));
                String sum = String.valueOf(a + b).length() == 1 ? "0" + String.valueOf(a + b) : String.valueOf(a + b);
                newNum = b + sum.substring(1, 2);
                cnt++;
                if (newNum.equals(N)) {
                    bw.write(String.valueOf(cnt));
                    return;
                }
            }
        }
    }
}
