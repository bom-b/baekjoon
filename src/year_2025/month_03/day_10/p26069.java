package year_2025.month_03.day_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p26069 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());

            Set<String> dancingPeople = new HashSet<>();
            dancingPeople.add("ChongChong");

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String person1 = st.nextToken();
                String person2 = st.nextToken();

                if (dancingPeople.contains(person1) || dancingPeople.contains(person2)) {
                    dancingPeople.add(person1);
                    dancingPeople.add(person2);
                }
            }

            bw.write(String.valueOf(dancingPeople.size()));
        }
    }
}
