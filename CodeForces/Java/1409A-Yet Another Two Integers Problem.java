// Time in milliseconds: 390

import java.util.*;
public class Temp
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int times=uInput.nextInt();
        for(int i=0;i<times;i++)
        {
            int a=uInput.nextInt();
            int b=uInput.nextInt();
            int difference=Math.abs(a-b);
            System.out.println((int)Math.ceil(difference/10.0));
        }
    }
}