package year_2025.month_01.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10811 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer line1 = new StringTokenizer(br.readLine());
        int bucketCnt = Integer.parseInt(line1.nextToken());
        int repeatCnt= Integer.parseInt(line1.nextToken());

        int[] bucketArr = new int[bucketCnt];
        Arrays.setAll(bucketArr, i -> i + 1);

        for (int i = 0; i < repeatCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) -1;
            int endIndex = Integer.parseInt(st.nextToken()) -1;
            int changeRange = endIndex - startIndex + 1;

            int[] temp = new int[changeRange];
            for (int j = startIndex; j <= endIndex; j++) {
                temp[endIndex - 1] = bucketArr[j - 1];
            }
            for (int j = startIndex - 1; j < changeRange; j++) {
                bucketArr[i] = temp[i];
            }
        }

        for (int bucket : bucketArr) {
            bw.write(bucket + " ");
        }

        bw.flush();
        bw.close();
    }
}
