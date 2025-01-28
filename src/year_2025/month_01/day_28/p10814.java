package year_2025.month_01.day_28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10814 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());
            String[] members = new String[repeat];

            for (int i = 0; i < repeat; i++) {
                members[i] = i + " " + br.readLine();
            }

            Arrays.sort(members, (a, b) -> {
                StringTokenizer st = new StringTokenizer(a);
                int indexOfA = Integer.parseInt(st.nextToken());
                int ageOfA = Integer.parseInt(st.nextToken());

                st = new StringTokenizer(b);
                int indexOfB = Integer.parseInt(st.nextToken());
                int ageOfB = Integer.parseInt(st.nextToken());

                if (ageOfA == ageOfB) {
                    return Integer.compare(indexOfA, indexOfB);
                } else {
                    return Integer.compare(ageOfA, ageOfB);
                }
            });

            for (String member : members) {
                String memberInfo = member.substring(member.indexOf(" ") + 1);
                bw.write(memberInfo + "\n");
            }
        }
    }
}
