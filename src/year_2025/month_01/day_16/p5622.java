package year_2025.month_01.day_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class p5622 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> dialog = new HashMap<>();
        dialog.put(3, "ABC");
        dialog.put(4, "DEF");
        dialog.put(5, "GHI");
        dialog.put(6, "JKL");
        dialog.put(7, "MNO");
        dialog.put(8, "PQRS");
        dialog.put(9, "TUV");
        dialog.put(10, "WXYZ");

        String input = br.readLine();
        int totalTime = 0;
        for (char alphabet : input.toCharArray()) {
            for (Map.Entry<Integer, String> entry : dialog.entrySet()) {
                if (entry.getValue().contains(String.valueOf(alphabet))) {
                    totalTime += entry.getKey();
                    break;
                }
            }
        }

        bw.write(String.valueOf(totalTime));
        bw.flush();
        bw.close();
    }
}
