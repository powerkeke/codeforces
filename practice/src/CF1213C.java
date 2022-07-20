/**
 * @author dtp
 * @date 2022-07-19 15:55
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1213C {

    //CF1213C
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            long n = cin.nextLong();
            long m = cin.nextLong();
            int len = 1;
            long[] p = new long[11];
            long aSum = m % 10;
            p[len] = m % 10;
            for (int i = 2; ; i++) {
                if ((i * m) % 10 == 0 || i * m > n) {
                    p[++len] = 0;
                    break;
                }
                p[++len] = (i * m) % 10;
                aSum += p[len];
            }
            long sum = n / m;
            sum /= len;
            long ans = sum * aSum;
            long length = n / m - sum * len;
            for (int i = 1; i <= length; i++) ans += p[i];
            System.out.println(ans);
        }
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

        static long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
