package year_2025.month_01.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10813 {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer line1 = new StringTokenizer(br.readLine());
        int bucketCnt = Integer.parseInt(line1.nextToken());
        int repeatCnt= Integer.parseInt(line1.nextToken());

        int[] bucketArr = new int[bucketCnt];
        for (int i = 0; i < bucketCnt; i++) {
            bucketArr[i] = i + 1;
        }

        for (int i = 0; i < repeatCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int target1 = Integer.parseInt(st.nextToken()) - 1;
            int target2 = Integer.parseInt(st.nextToken()) - 1 ;
            int temp = bucketArr[target1];
            bucketArr[target1] = bucketArr[target2];
            bucketArr[target2] = temp;
        }

        for (int i = 0; i < bucketCnt; i++) {
            bw.write(bucketArr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
