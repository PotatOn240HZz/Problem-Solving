// Time in milliseconds: 187

import java.util.*;
public class EzPzLmnSqz 
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int digit=uInput.nextInt();
        String S1=uInput.next();
        String S2=uInput.next();
        int sum=0;
        for(int i=0;i<digit;i++)
            {
                if(Math.abs(S1.charAt(i)-S2.charAt(i)) < 5)
                   sum+=(Math.abs(S1.charAt(i)-S2.charAt(i)));
                else 
                   sum+=(10-Math.abs(S1.charAt(i)-S2.charAt(i)));
            }
        System.out.println(sum);
    }
}