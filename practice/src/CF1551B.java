/**
 * @author dtp
 * @date 2022-07-12 14:16
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1551B {

    //CF1551B
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            String n = cin.nextLine();
            int[] vis = new int[27];
            int ans = 0;
            int sum = 0;
            for (int i = 0; i < n.length(); i++) vis[n.charAt(i) - 'a']++;
            for (int i = 0; i < 26; i++) {
                int vi = vis[i];
                if (vi >= 2) ++ans;
                if (vi == 1) ++sum;
            }
            System.out.println(ans + sum / 2);
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
