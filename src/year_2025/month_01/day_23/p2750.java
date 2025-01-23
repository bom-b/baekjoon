package year_2025.month_01.day_23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2750 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int cnt = Integer.parseInt(br.readLine());

            int[] nums = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j - 1] > nums[j]) {
                        int temp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

            for (int num : nums) {
                bw.write(num + "\n");
            }
        }
    }
}
