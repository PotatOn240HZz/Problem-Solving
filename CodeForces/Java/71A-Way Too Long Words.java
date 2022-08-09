// Time in milliseconds: 202

import java.util.*;
public class EzPzLmnSqz 
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int times=uInput.nextInt();
        for(int i=0;i<times;i++)
        {
            String S=uInput.next();
            if(S.length() <= 10)
                System.out.println(S);
            else
            {
                System.out.print(S.charAt(0));
                System.out.print(S.length()-2);
                System.out.println(S.charAt(S.length()-1));
            }
        }
    }
}