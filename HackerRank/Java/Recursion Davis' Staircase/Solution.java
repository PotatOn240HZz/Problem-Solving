import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'stepPerms' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int stepPerms(int n) {
    // Write your code here
        int[] array = new int[n];
        if (n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        else if(n == 3) {
            return 4;
        }
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i < n; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }
        return array[array.length-1];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = Integer.parseInt(bufferedReader.readLine().trim());

        for (int sItr = 0; sItr < s; sItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int res = Result.stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem