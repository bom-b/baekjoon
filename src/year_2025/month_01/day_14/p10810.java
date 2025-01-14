package year_2025.month_01.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10810 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer line1 = new StringTokenizer(br.readLine());
        int bucketCnt = Integer.parseInt(line1.nextToken());
        int repeatCnt= Integer.parseInt(line1.nextToken());

        int[] bucketArr = new int[bucketCnt];
        for (int i = 0; i < repeatCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) -1;
            int endIndex = Integer.parseInt(st.nextToken()) -1;
            int ballNumber = Integer.parseInt(st.nextToken());

            for (int j = startIndex; j <= endIndex; j++) {
                bucketArr[j] = ballNumber;
            }
        }

        for (int i = 0; i < bucketCnt; i++) {
            bw.write(bucketArr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
