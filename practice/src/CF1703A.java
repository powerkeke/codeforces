
import java.io.*;
import java.util.*;

public class CF1703A {

    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            String s = cin.nextLine();
            System.out.println(jud(s) ? "YES" : "NO");
        }
    }

    private static boolean jud(String s) {
        if (s.charAt(0) != 'Y' && s.charAt(0) != 'y') return false;
        if (s.charAt(1) != 'E' && s.charAt(1) != 'e') return false;
        if (s.charAt(2) != 'S' && s.charAt(2) != 's') return false;
        return true;
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