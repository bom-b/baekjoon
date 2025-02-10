package year_2025.month_02.day_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class p9012 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                String input = br.readLine();
                Stack<Character> stack = new Stack<>();

                for (char c : input.toCharArray()) {
                    if (c == '(') {
                        stack.push(c);
                    } else {
                        if (!stack.empty() && stack.lastElement() == '(') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    }
                }

                bw.write((stack.isEmpty()? "YES" : "NO") + "\n");
            }
        }
    }
}
