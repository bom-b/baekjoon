package year_2025.month_02.day_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p18258 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();
            int lastNum = 0;
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();

                switch (command) {
                    case "push":
                        int num = Integer.parseInt(st.nextToken());
                        queue.add(num);
                        lastNum = num;
                        break;
                    case "pop":
                        bw.write((queue.isEmpty()? -1 : queue.poll()) + "\n");
                        break;
                    case "size":
                        bw.write(queue.size() + "\n");
                        break;
                    case "empty":
                        bw.write((queue.isEmpty()? 1 : 0) + "\n");
                        break;
                    case "front":
                        bw.write((queue.isEmpty()? -1 : queue.peek()) + "\n");
                        break;
                    case "back":
                        bw.write((queue.isEmpty()? -1 : lastNum) + "\n");
                }
            }
        }
    }
}
