package year_2025.month_01.day_30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p1269 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int lenA = Integer.parseInt(st.nextToken());
            int lenB = Integer.parseInt(st.nextToken());

            Set<Integer> nums = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < lenA; i++) {
                nums.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < lenB; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (nums.contains(num)) {
                    nums.remove(num);
                } else {
                    nums.add(num);
                }
            }

            bw.write(String.valueOf(nums.size()));
        }
    }
}
