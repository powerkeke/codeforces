/**
 * @author dtp
 * @date 2022-07-11 17:31
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CF1702D {

    static class Let {
        private int index;
        private int val;
        private boolean del;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public boolean isDel() {
            return del;
        }

        public void setDel(boolean del) {
            this.del = del;
        }
    }

    //CF1702D
    private static void task() throws IOException {
        int t = cin.nextInt();
        while (t-- != 0) {
            String n = cin.nextLine();
            int m = cin.nextInt();
            int sum = 0;
            List<Let> letList = new ArrayList<>();
            for (int i = 0; i < n.length(); i++) {
                Let let = new Let();
                let.setIndex(i);
                let.setDel(false);
                let.setVal(n.charAt(i) - 'a' + 1);
                sum += let.getVal();
                letList.add(let);
            }
            letList.sort(Comparator.comparingInt(Let::getVal));
            for (int i = n.length() - 1; i >= 0; i--) {
                if (sum <= m) break;
                sum -= letList.get(i).getVal();
                letList.get(i).setDel(true);
            }
            letList.sort(Comparator.comparingInt(Let::getIndex));
            for (Let let : letList) {
                if (!let.isDel()) System.out.print((char) (let.getVal() - 1 + 'a'));
            }
            System.out.println("");
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
