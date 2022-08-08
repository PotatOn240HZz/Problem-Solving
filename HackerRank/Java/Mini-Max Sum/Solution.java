import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        int max=0,min=0;
        long sum=0;
        for(int i=0;i<arr.size();i++)
            {
                if(i==0)
                    min=max=arr.get(0);
                else if(max>arr.get(i))
                    max=arr.get(i);
                else if(min<arr.get(i))
                    min=arr.get(i);
                sum+=arr.get(i);
            }
        System.out.println(sum-min+" "+(sum-max));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

//https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem