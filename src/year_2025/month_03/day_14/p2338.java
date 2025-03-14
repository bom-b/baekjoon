package year_2025.month_03.day_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class p2338 {
    public static void solution() throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            BigInteger A = new BigInteger(br.readLine());
            BigInteger B = new BigInteger(br.readLine());

            bw.write(A.add(B) + "\n");
            bw.write(A.subtract(B) + "\n");
            bw.write(A.multiply(B) + "\n");
        }
    }
}
