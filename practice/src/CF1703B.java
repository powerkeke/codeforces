/**
 * @author dtp
 * @date 2022-07-14 16:33
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1703B {

    //CF1703B
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            String s = cin.nextLine();
            int ans = 0;
            boolean[] vis = new boolean[27];
            for (int i = 0; i < n; i++) {
                if (vis[s.charAt(i) - 'A']) ++ans;
                else {
                    ans += 2;
                    vis[s.charAt(i) - 'A'] = true;
                }
            }
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

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
