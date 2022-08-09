// Time in milliseconds: 436

import java.util.*;
public class EzPzLmnSqz 
{
    public static boolean solve(int input)
    {
        if(input%2==0)
        {
            double test=input/2;
                if(test%2==0)
                    return true;
                else
                {
                    for(int i=2;i<input;i++)
                        {
                            for(int j=2;j<input;j++)
                                if(i+j==input && i%2==0 && j%2==0)
                                 return true;
                        }
                    return false;
                }
        }
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int input=uInput.nextInt();
        if(solve(input))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}