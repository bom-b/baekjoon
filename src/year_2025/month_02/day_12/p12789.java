package year_2025.month_02.day_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class p12789 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            int nextNum = 1;
            Stack<Integer> stack = new Stack<>();
            String result = "Nice";

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (N-- > 0) {
                int num = Integer.parseInt(st.nextToken());
                if (num == nextNum) {
                    nextNum++;
                } else {
                    while (!stack.isEmpty() && stack.peek() == nextNum) {
                        nextNum++;
                        stack.pop();
                    }

                    if (stack.isEmpty() || stack.peek() > num) {
                        stack.push(num);
                    } else {
                        result = "Sad";
                        break;
                    }
                }
            }

            bw.write(result);
        }
    }
}
