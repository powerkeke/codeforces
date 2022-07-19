/**
 * @author dtp
 * @date 2022-07-18 18:06
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1703E {

    //CF1703E
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            int[][] p = new int[n + 2][n + 2];
            String[] getInput = new String[n + 1];
            Boolean[][] vis = new Boolean[n + 2][n + 2];
            for (int i = 1; i <= n; i++) getInput[i] = cin.nextLine();
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= n; k++) {
                    p[i][k] = getInput[i].charAt(k - 1) - '0';
                    vis[i][k] = false;
                }
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= n; k++) {
                    if (vis[i][k]) continue;
                    int sum1 = 0;
                    int sum0 = 0;
                    if (p[i][k] == 1) ++sum1;
                    else ++sum0;
                    vis[i][k] = true;
                    if (p[k][n - i + 1] == 1) ++sum1;
                    else ++sum0;
                    vis[k][n - i + 1] = true;
                    if (p[n - i + 1][n - k + 1] == 1) ++sum1;
                    else ++sum0;
                    vis[n - i + 1][n - k + 1] = true;
                    if (p[n - k + 1][i] == 1) ++sum1;
                    else ++sum0;
                    vis[n - k + 1][i] = true;

                    ans += Math.min(sum1, sum0);
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
