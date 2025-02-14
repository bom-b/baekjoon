package year_2025.month_02.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p31403 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String A = br.readLine();
            String B = br.readLine();
            String C = br.readLine();

            bw.write(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C) + "\n");
            bw.write(Integer.parseInt(A + B) - Integer.parseInt(C) + "");
        }
    }
}
