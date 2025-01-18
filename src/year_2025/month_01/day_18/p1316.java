package year_2025.month_01.day_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class p1316 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeatCnt = Integer.parseInt(br.readLine());
            int groupWordCnt = 0;

            for (int i = 0; i < repeatCnt; i++) {
                String input = br.readLine();

                Set<Character> seenChars = new HashSet<>();
                char prevChar = '-';
                boolean isGroupWord = true;

                for (char character : input.toCharArray()) {
                    if (character != prevChar) {
                        if(!seenChars.add(character)) {
                            isGroupWord = false;
                            break;
                        }
                        prevChar = character;
                    }
                }
                if (isGroupWord) groupWordCnt++;
            }

            bw.write(String.valueOf(groupWordCnt));
        }
    }
}
