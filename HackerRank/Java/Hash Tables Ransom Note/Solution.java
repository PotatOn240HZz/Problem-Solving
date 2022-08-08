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
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        boolean condition=true;
        for(int i=0;i<magazine.size();i++)
            {
                if(!words.containsKey(magazine.get(i)))
                    words.put(magazine.get(i),1);
                else
                    words.put(magazine.get(i),words.get(magazine.get(i))+1);
            }
        for(int i=0;i<note.size() && condition;i++)
            {
                if(!words.containsKey(note.get(i)))
                    condition=false;
                else
                    {
                        if(words.get(note.get(i))-1 == 0)
                            words.remove(note.get(i));
                        else
                            words.put(note.get(i),words.get(note.get(i))-1);
                    }
            }
        if(condition)
            System.out.print("Yes");
        else
            System.out.print("No");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}

//https://www.hackerrank.com/challenges/ctci-ransom-note/problem