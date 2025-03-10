package year_2025.month_03.day_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class p2108 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            int total = 0;
            int[] nums = new int[N];
            Map<Integer, Integer> frequency = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int input = Integer.parseInt(br.readLine());
                total += input;
                nums[i] = input;
                frequency.put(input, frequency.getOrDefault(input, 0) + 1);
            }
            Arrays.sort(nums);

            bw.write(Math.round(total * 1.0/ N) + "\n");
            bw.write(nums[N / 2] + "\n");
            bw.write(findMostFrequentVal(frequency) + "\n");
            bw.write(nums[N - 1] - nums[0] + "\n");
        }
    }

    public static int findMostFrequentVal(Map<Integer, Integer> frequency) {
        int maxFrequency = Collections.max(frequency.values());

        List<Integer> mostFrequentVals = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == maxFrequency) mostFrequentVals.add(entry.getKey());
        }

        Collections.sort(mostFrequentVals);
        return mostFrequentVals.size() > 1 ? mostFrequentVals.get(1) : mostFrequentVals.get(0);
    }
}
