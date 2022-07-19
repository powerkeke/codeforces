/**
 * @author dtp
 * @date 2022-07-19 15:44
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1213A {

    //CF1213A
    private static void task() throws IOException {
        int n = cin.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            int a = cin.nextInt();
            if ((a & 1) == 1) ++sum1;
            else ++sum2;
        }
        System.out.println(Math.min(sum1, sum2));
    }

    public static void main(String[] args) throws IOException {
        task();
    }

    static class cin {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static StringTokenizer tokenizer = new StringTokenizer("");

        static String nextLine() throws IOException {
            return reader.readLine();
        }

        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
