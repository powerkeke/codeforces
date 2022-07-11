import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author dtp
 * @date 2022-07-11 9:51
 * @title 1702A
 */
public class main {


    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            int n = cin.nextInt();
            System.out.println(n - (int) Math.pow(10, String.valueOf(n).length() - 1));
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
