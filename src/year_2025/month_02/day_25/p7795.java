package year_2025.month_02.day_25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p7795 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                List<Integer> A = new ArrayList<>();
                st = new StringTokenizer(br.readLine());
                while (N-- > 0) {
                    A.add(Integer.parseInt(st.nextToken()));
                }

                List<Integer> B = new ArrayList<>();
                st = new StringTokenizer(br.readLine());
                while (M-- > 0) {
                    B.add(Integer.parseInt(st.nextToken()));
                }
                B.sort(Integer::compareTo);

                int biggerCnt = 0;
                for (Integer x : A) {
                    biggerCnt += getLowerCount(B, x);
                }

                bw.write(biggerCnt + "\n");
            }
        }
    }

    public static int getLowerCount(List<Integer> nums, int key) {
        int left = 0;
        int right = nums.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums.get(mid) >= key) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
