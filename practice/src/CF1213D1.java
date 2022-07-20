/**
 * @author dtp
 * @date 2022-07-19 16:31
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1213D1 {

    //CF1213D1
    private static void task() throws IOException {
        int n = cin.nextInt();
        int m = cin.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) p[i] = cin.nextInt();
        Arrays.sort(p);
        int ans = 0x3f3f3f3f;
        for (int i = 1; i <= 200000; i++) {
            int sum = 0;
            int num = 0;
            for (int k = 0; k < n; k++) {
                int sum1 = 0;
                int g = p[k];
                while (g > i) {
                    g /= 2;
                    ++sum1;
                }
                if (g == i) {
                    sum += sum1;
                    ++num;
                }
                if (num == m) break;
            }
            if (num == m) ans = Math.min(sum, ans);
            if (p[n - m] < i) break;
        }
        System.out.println(ans);
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
