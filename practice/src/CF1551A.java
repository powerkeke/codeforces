/**
 * @author dtp
 * @date 2022-07-12 11:53
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1551A {

    //CF1551A
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            int a1 = n / 3;
            int b1 = (n - a1) / 2;
            int b2 = n / 3;
            int a2 = n - b2 * 2;
            if ((n - a1) % 2 == 1) {
                System.out.println(a2 + " " + b2);
            } else {
                if (Math.abs(a1 - b1) <= Math.abs(a2 - b2)) System.out.println(a1 + " " + b1);
                else System.out.println(a2 + " " + b2);
            }
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

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
