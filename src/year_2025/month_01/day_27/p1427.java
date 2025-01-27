package year_2025.month_01.day_27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p1427 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = br.readLine();
            int inputLen = input.length();
            int[] nums = new int[inputLen];

            for (int i = 0; i < inputLen; i++) {
                int num = Character.getNumericValue(input.charAt(i));
                nums[i] = num;
            }

            Arrays.sort(nums);
            for (int i = inputLen - 1; i >= 0; i--) {
                bw.write(String.valueOf(nums[i]));
            }
        }
    }
}
