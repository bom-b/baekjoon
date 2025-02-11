package year_2025.month_02.day_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class p4949 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            while (true) {
                String input = br.readLine();
                if (input.equals(".")) break;

                Stack<Character> stack = new Stack<>();
                for (char c : input.toCharArray()) {
                    if (c == '(') {
                        stack.push(c);
                    } else if (c == ')') {
                        if (!stack.empty() && stack.lastElement() == '(') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else if (c == '[') {
                        stack.push(c);
                    } else if (c == ']') {
                        if (!stack.empty() && stack.lastElement() == '[') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    }
                }

                bw.write((stack.isEmpty()? "yes" : "no") + "\n");
            }
        }
    }
}
