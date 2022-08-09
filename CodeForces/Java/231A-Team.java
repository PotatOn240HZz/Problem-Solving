// Time in milliseconds: 372

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 public class EzPzLmnSqz 
{
        static PrintWriter pw=new PrintWriter(System.out);
    //public static int test(int testt){}
    public static void main(String[] args) throws IOException 
    {
        //new FileReader("hello.io")
        Reader.init(System.in);
        //START
                int num=Reader.nextInt();
        int answer=0;
        for(int i=0;i<num;i++)
        {
            int team=0;
            for (int j=0;j<3;j++)
            {
                int temp=Reader.nextInt();
                if(temp==1)
                    team++;
            }
            if(team >= 2)
                answer++;
        }
        pw.println(answer);
                //END
        pw.close();
        //long m=Reader.nextInt();
        //pw.println(m);
    }
}
      class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;
        public static int pars(String x) {
            int num = 0;
            int i = 0;
            if (x.charAt(0) == '-') {
                i = 1;
            }
            for (; i < x.length(); i++) {
                num = num * 10 + (x.charAt(i) - '0');
            }
             if (x.charAt(0) == '-') {
                return -num;
            }
             return num;
        }
        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }
        static void init(FileReader input) {
            reader = new BufferedReader(input);
            tokenizer = new StringTokenizer("");
        }
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }
        static int nextInt() throws IOException {
            return pars(next());
        }
        static long nextLong() throws IOException {
            return Long.parseLong(next());
        }
        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    } 