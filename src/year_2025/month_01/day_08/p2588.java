package year_2025.month_01.day_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2588 {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        for (int i = b.length()-1; i < b.length(); i--) {
            int num = Integer.parseInt(String.valueOf(b.charAt(i)));
            bw.write((a * num) + "\n");
        }

        bw.write(String.valueOf(a * Integer.parseInt(b)));
        bw.flush();
        bw.close();
    }
}
