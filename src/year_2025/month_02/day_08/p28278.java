package year_2025.month_02.day_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class p28278 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                switch (command) {
                    case "1":
                        int num = Integer.parseInt(st.nextToken());
                        stack.push(num);
                        break;
                    case "2":
                        bw.write(((stack.isEmpty()) ? "-1" : stack.pop()) + "\n");
                        break;
                    case "3":
                        bw.write(stack.size() + "\n");
                        break;
                    case "4":
                        bw.write((stack.isEmpty() ? "1" : "0") + "\n");
                        break;
                    case "5":
                        bw.write(((stack.isEmpty()) ? "-1" : stack.lastElement()) + "\n");
                        break;
                }
            }
        }
    }
}
