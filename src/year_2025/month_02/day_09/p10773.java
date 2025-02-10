package year_2025.month_02.day_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class p10773 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int K = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();

            while (K-- > 0) {
                String input = br.readLine();
                if (input.equals("0")) {
                    stack.pop();
                } else {
                    stack.push(Integer.parseInt(input));
                }
            }

            int total = 0;
            for (int num : stack) {
                total += num;
            }

            bw.write(String.valueOf(total));
        }
    }
}
