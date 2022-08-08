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
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    // Write your code here
        int moves=0;
        boolean notChaotic=true;
        for(int i=q.size()-1;i>0 && notChaotic;i--)
            {
                if(q.get(i-1)==i+1)
                    {
                        q.set(i-1,q.get(i));
                        q.set(i,i+1);
                        moves++;
                    }
                else if(i!=1 && q.get(i-2)==i+1)
                    {
                        q.set(i-2,q.get(i-1));
                        q.set(i-1,q.get(i));
                        q.set(i,i+1);
                        moves+=2;
                    }
                else if(q.get(i)!=i+1)
                    notChaotic=false;
            }
        if(notChaotic==false)
            System.out.println("Too chaotic");
        else
            System.out.println(moves);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

//https://www.hackerrank.com/challenges/one-week-preparation-kit-new-year-chaos/problem