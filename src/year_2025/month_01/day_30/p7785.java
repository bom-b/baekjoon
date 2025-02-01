package year_2025.month_01.day_30;

import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p7785 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int logLen = Integer.parseInt(br.readLine());

            Set<String> employees = new HashSet<>();
            for (int i = 0; i < logLen; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String status = st.nextToken();

                if (status.equals("enter")) {
                    employees.add(name);
                } else {
                    employees.remove(name);
                }
            }

            employees.stream().sorted(Comparator.reverseOrder()).forEach(employee -> {
                try {
                    bw.write(employee + "\n");
                } catch (IOException ignored) {}
            });
        }
    }
}
