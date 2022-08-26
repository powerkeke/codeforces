/**
 * @author dtp
 * @date 2022-07-22 10:18
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1714A {

    //CF1714A
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            int h = cin.nextInt();
            int m = cin.nextInt();
            int cnt = h * 60 + m;
            int ans = 0x3f3f3f3f;
            int minn = 0x3f3f3f3f;
            for (int i = 0; i < n; i++) {
                int h1 = cin.nextInt();
                int m1 = cin.nextInt();
                int cnt1 = m1 + h1 * 60;
                if (cnt1 >= cnt) {
                    ans = Math.min(ans, cnt1 - cnt);
                }
                minn = Math.min(minn, cnt1);
            }
            if (ans == 0x3f3f3f3f) {
                ans = minn + 23 * 60 + 59 - cnt + 1;
            }
            System.out.println(ans / 60 + " " + ans % 60);
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
