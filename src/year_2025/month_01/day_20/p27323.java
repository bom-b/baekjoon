package year_2025.month_01.day_20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p27323 {
    public static void solution() throws Exception{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int height = Integer.parseInt(br.readLine());
            int width = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(height * width));
        }
    }
}
