package year_2025.month_01.day_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2587 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int[] nums = new int[5];
            int total = 0;
            for (int i = 0; i < 5; i++) {
                int num = Integer.parseInt(br.readLine());
                nums[i] = num;
                total += num;
            }

            Arrays.sort(nums);
            bw.write(total / 5 + "\n" + nums[2]);
        }
    }
}
