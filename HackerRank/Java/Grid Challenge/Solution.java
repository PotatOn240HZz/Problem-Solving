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
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String sortString(String inputString)
        {
            // Converting input string to character array
            char tempArray[] = inputString.toCharArray();
    
            // Sorting temp array using
            Arrays.sort(tempArray);
    
            // Returning new sorted string
            return new String(tempArray);
        }

    public static String gridChallenge(List<String> grid) {
    // Write your code here
        for (int i = 0; i < grid.size(); ++i) {
            char[] s = grid.get(i).toCharArray();
            Arrays.sort(s);
            grid.set(i, new String(s));
        }
                
        for (int i = 0; i < grid.size()-1; i++) {
            for (int j = 0; j < grid.get(i).length(); j++) {
                System.out.println(j);
                if (grid.get(i).charAt(j) > grid.get(i+1).charAt(j)) {
                    return "NO";
                }
            }
        }
        
        return "YES";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result.gridChallenge(grid);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//https://www.hackerrank.com/challenges/one-week-preparation-kit-grid-challenge/problem