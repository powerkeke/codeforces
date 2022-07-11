/**
 * @author dtp
 * @date 2022-07-11 11:02
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CF1702B {

    //1702B
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            String s = cin.nextLine();
            Set<Character> now = new HashSet<>();
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if(now.contains(s.charAt(i)))continue;
                now.add(s.charAt(i));
                if (now.size() == 4) {
                    ++ans;
                    now.clear();
                    now.add(s.charAt(i));
                }
            }
            ans += (now.isEmpty() ? 0 : 1);
            System.out.println(ans == 0 ? 1 : ans);
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
