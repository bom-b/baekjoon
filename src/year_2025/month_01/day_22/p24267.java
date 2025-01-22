package year_2025.month_01.day_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p24267 {
    public static void solution() throws Exception{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            long input = Long.parseLong(br.readLine());

            bw.write((input * (input -1) * (input -2) / 6)+ "\n3");
        }
    }
}
