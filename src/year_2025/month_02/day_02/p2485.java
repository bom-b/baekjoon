package year_2025.month_02.day_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class p2485 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int repeat = Integer.parseInt(br.readLine());

            List<Integer> gaps = new ArrayList<>();
            int firstNum = Integer.parseInt(br.readLine());
            int preNum = firstNum;
            for (int i = 1; i < repeat; i++) {
                int nextNum = Integer.parseInt(br.readLine());
                gaps.add(nextNum - preNum);
                preNum = nextNum;
            }

            int index = repeat - 2;
            while (gaps.size() > 1) {
                int gcdOfGap = getGcd(gaps.get(index), gaps.get(index - 1));
                gaps.set(index - 1, gcdOfGap);
                gaps.remove(index);
                index--;
            }

            int finalGap = gaps.get(0);
            int requireCnt = (finalGap == 1)? preNum - firstNum + 1 : ((preNum - firstNum + 1) / finalGap) + 1;

            bw.write(String.valueOf(requireCnt - repeat));
        }
    }

    public static int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
