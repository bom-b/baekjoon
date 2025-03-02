package year_2025.month_03.day_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p25501 {
    static int repeat = 0;

    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                String input = br.readLine();
                bw.write(isPalindrome(input) + " " + repeat + "\n");
            }
        }
    }

    public static int recursion(String s, int l, int r) {
        repeat++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        repeat = 0;
        return recursion(s, 0, s.length() -  1);
    }
}
