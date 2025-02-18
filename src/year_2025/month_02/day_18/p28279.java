package year_2025.month_02.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p28279 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());

            Deque<Integer> deque = new ArrayDeque<>();
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();

                switch (command) {
                    case "1": {
                        int num = Integer.parseInt(st.nextToken());
                        deque.offerFirst(num);
                        break;
                    }
                    case "2": {
                        int num = Integer.parseInt(st.nextToken());
                        deque.offerLast(num);
                        break;
                    }
                    case "3":
                        bw.write((deque.isEmpty()? -1 : deque.pollFirst()) + "\n");
                        break;
                    case "4":
                        bw.write((deque.isEmpty()? -1 : deque.pollLast()) + "\n");
                        break;
                    case "5":
                        bw.write(deque.size() + "\n");
                        break;
                    case "6":
                        bw.write((deque.isEmpty()? 1 : 0) + "\n");
                        break;
                    case "7":
                        bw.write((deque.isEmpty()? -1 : deque.peekFirst()) + "\n");
                        break;
                    case "8":
                        bw.write((deque.isEmpty()? -1 : deque.peekLast()) + "\n");
                        break;
                }
            }
        }
    }
}
