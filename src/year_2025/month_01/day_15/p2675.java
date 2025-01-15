package year_2025.month_01.day_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2675 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcaseCnt = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < testcaseCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeatCnt = Integer.parseInt(st.nextToken());
            String inputString = st.nextToken();
            for (char character : inputString.toCharArray()) {
                result.append(String.valueOf(character).repeat(repeatCnt));
            }
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();

    }
}
