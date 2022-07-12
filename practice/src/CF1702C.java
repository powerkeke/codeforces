/**
 * @author dtp
 * @date 2022-07-11 13:48
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CF1702C {

    //1702C
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            Map<Integer, Integer> first = new HashMap<>();
            Map<Integer, Integer> second = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                int a = cin.nextInt();
                if (!first.containsKey(a)) first.put(a, i);
                second.put(a, i);
            }
            while (m-- != 0) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                if (first.containsKey(a) && second.containsKey(b) && first.get(a) < second.get(b)) {
                    System.out.println("YES");
                } else System.out.println("NO");
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
