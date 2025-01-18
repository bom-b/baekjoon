package year_2025.month_01.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2941 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = br.readLine();
            String[] findStrArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            int strCnt = 0;
            for (String str : findStrArr) {
                input = input.replaceAll(str, " ");
            }
            strCnt += input.length();

            bw.write(String.valueOf(strCnt));
        }
    }
}
