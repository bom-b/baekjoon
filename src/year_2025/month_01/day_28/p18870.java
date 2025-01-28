package year_2025.month_01.day_28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class p18870 {

/*

    first challenge : timeout

    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());

            List<Long> nums = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < repeat; i++) {
                nums.add(Long.parseLong(st.nextToken()));
            }

            List<Long> numsIndexes = new ArrayList<>(new TreeSet<>(nums));

            for (long num : nums) {
                int index = numsIndexes.indexOf(num);
                bw.write(index + " ");
            }
        }
    }*/

    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());

            long[] nums = new long[repeat];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < repeat; i++) {
                nums[i] = Long.parseLong(st.nextToken());
            }

            long[] sortedNums = Arrays.stream(nums).sorted().toArray();
            Map<Long, Integer> numsWithIndex = new HashMap<>();
            int i = 0;
            for (long num : sortedNums) {
                if (!numsWithIndex.containsKey(num)) {
                    numsWithIndex.put(num, i);
                    i++;
                }
            }

            for (long num : nums) {
                int index = numsWithIndex.get(num);
                bw.write(index + " ");
            }
        }
    }
}
