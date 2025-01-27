package year_2025.month_01.day_27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2751 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());

            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(nums);

            for (int num : nums) {
                bw.write(num + "\n");
            }
        }
    }
}
