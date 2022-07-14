/**
 * @author dtp
 * @date 2022-07-14 16:39
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1703C {

    //CF1703C
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            int[] mi = new int[n + 1];
            for (int i = 1; i <= n; i++) mi[i] = cin.nextInt();
            for (int x = 1; x <= n; x++) {
                int moveStep = cin.nextInt();
                String moveStr = cin.next();
                for (int i = 0; i < moveStep; i++) {
                    char moveChar = moveStr.charAt(i);
                    if (moveChar == 'D') mi[x] = U(mi[x]);
                    else if (moveChar == 'U') mi[x] = D(mi[x]);
                }
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 1; i <= n; i++) ans.append(mi[i]).append(" ");
            System.out.println(ans.substring(0, ans.length() - 1));
        }
    }

    private static int U(int x) {
        return (++x == 10 ? 0 : x);
    }

    private static int D(int x) {
        return (--x == -1 ? 9 : x);
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
