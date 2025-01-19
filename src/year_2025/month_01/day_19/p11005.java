package year_2025.month_01.day_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class p11005 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int base = Integer.parseInt(st.nextToken());

            Stack<Integer> stack = new Stack<>();
            while (input > 0) {
                stack.push(input % base);
                input /= base;
            }

            StringBuilder result = new StringBuilder();
            while (!stack.empty()) {
                int num = stack.pop();
                String str = (num < 10) ? String.valueOf(num) : String.valueOf((char) (num + 55));
                result.append(str);
            }

            bw.write(result.toString());
        }
    }
}
