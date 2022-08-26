/*
  @author dtp
 * @date 2022-08-26 14:46
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1714C {

    //CF1714C
    private static void task() throws IOException {
        String[] p = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "19", "29", "39",
                "49", "59", "69", "79", "89", "189", "289",
                "389", "489", "589", "689", "789", "1789",
                "2789", "3789", "4789", "5789", "6789", "16789",
                "26789", "36789", "46789", "56789", "156789", "256789",
                "356789", "456789", "1456789", "2456789", "3456789", "13456789",
                "23456789", "123456789"};
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            System.out.println(p[n]);
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
