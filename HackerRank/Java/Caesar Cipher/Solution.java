import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        String ans="";
        k=k%26;
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)<=122 && s.charAt(i)>=97)
                    {
                        if(s.charAt(i)+k>122)
                            ans+=(char)(s.charAt(i)+k-26);
                        else
                            ans+=(char)(s.charAt(i)+k);
                    }
                else if(s.charAt(i)>=65 && s.charAt(i)<=90)
                    {
                        if(s.charAt(i)+k>90)
                            ans+=(char)(s.charAt(i)+k-26);
                        else
                            ans+=(char)(s.charAt(i)+k);
                    }
                else
                    ans+=(char)(s.charAt(i));
            }
        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//https://www.hackerrank.com/challenges/one-week-preparation-kit-caesar-cipher-1/problem