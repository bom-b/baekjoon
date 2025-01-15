package year_2025.month_01.day_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1152 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st  = new StringTokenizer(br.readLine());
        int wordCnt = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            wordCnt++;
        }

        bw.write(String.valueOf(wordCnt));
        bw.flush();
        bw.close();
    }
}
