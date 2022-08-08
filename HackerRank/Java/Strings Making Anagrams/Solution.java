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
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    // Write your code here
        int[][] letters=new int[2][26];
        int answer=0;
        if(b.length()>a.length())
            {
                String temp=a;
                a=b;
                b=temp;
            }
        for(int i=0;i<b.length();i++)
        {
            letters[0][(a.charAt(i)-97)]++;
            letters[1][(b.charAt(i)-97)]++;
        }
        for(int i=b.length();i<a.length();i++)
            letters[0][(a.charAt(i)-97)]++;
        for(int i=0;i<26;i++)
            answer+=Math.abs(letters[0][i]-letters[1][i]);
        return answer;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//https://www.hackerrank.com/challenges/ctci-making-anagrams/problem