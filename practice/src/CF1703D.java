/**
 * @author dtp
 * @date 2022-07-14 16:57
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CF1703D {

    //CF1703D
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            Map<String, Boolean> map = new HashMap<>();
            String[] p = new String[n + 1];
            for (int i = 0; i < n; i++) {
                p[i] = cin.nextLine();
                map.put(p[i], true);
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) {
                xun:
                {
                    for (int k = 0; k < p[i].length(); k++) {
                        String str1 = p[i].substring(0, k);
                        String str2 = p[i].substring(k);
                        if (map.containsKey(str1) && map.containsKey(str2)) {
                            ans.append('1');
                            break xun;
                        }
                    }
                    ans.append('0');
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
