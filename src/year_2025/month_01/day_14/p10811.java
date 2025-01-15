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

        StringTokenizer prob = new StringTokenizer(br.readLine());
        int bucketCnt = Integer.parseInt(prob.nextToken());
        int repeatCnt = Integer.parseInt(prob.nextToken());

        int[] bucketArr = new int[bucketCnt];
        Arrays.setAll(bucketArr, i -> i +1);

        for (int i = 0; i < repeatCnt; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) - 1;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;

            while (startIndex < endIndex) {
                int temp = bucketArr[startIndex];
                bucketArr[startIndex] = bucketArr[endIndex];
                bucketArr[endIndex] = temp;
                startIndex ++;
                endIndex --;
            }
        }

        for (int bucket : bucketArr) {
            bw.write(bucket + " ");
        }

        bw.flush();
        bw.close();
    }
}
