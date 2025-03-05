package year_2025.month_03.day_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2309 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int[] dwarfs = new int[9];
            int sum = 0;
            for (int i = 0; i < dwarfs.length; i++) {
                int dwarf = Integer.parseInt(br.readLine());
                dwarfs[i] = dwarf;
                sum += dwarf;
            }
            Arrays.sort(dwarfs);

            int a = 0, b = 0;
            for (int i = 0; i < dwarfs.length - 1; i++) {
                for (int j = i + 1; j < dwarfs.length; j++) {
                    if (sum - dwarfs[i] - dwarfs[j] == 100) {
                        a = dwarfs[i];
                        b = dwarfs[j];
                        break;
                    }
                }
            }

            for (int dwarf : dwarfs) {
                if (dwarf != a && dwarf != b) {
                    bw.write(dwarf + "\n");
                }
            }
        }
    }
}
