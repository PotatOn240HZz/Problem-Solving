// Time in milliseconds: 187

import java.util.*;
public class EzPzLmnSqz 
{
//public static int test(int testt){}
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int times=uInput.nextInt();
        int temp=0;
        for(int t=0;t<=times;t++)
        {
            for(int i=0;i<=times;i++)
                if(t*i==times && temp==0)
                {
                    System.out.println(i+" "+t);
                    temp=1;
                    break;
                }
        }
    }
}