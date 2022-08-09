// Time in milliseconds: 436

import java.util.*;
public class Temp
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner (System.in);
        int x=uInput.nextInt();
        int sum=0;
        for(int i=0;i<x;i++)
        {
            int y=uInput.nextInt();
            sum+=y;
        }
        System.out.printf("%.12f",((double)sum/x));
                                                                                                                        /*int fraction2=6;
        while(times!=1 && fraction2%times == 0 && times!=fraction2)
        {
            fraction2/=times;
            times/=2;
        }
        if(fraction2==times)
            System.out.println("1/1");
        else
            System.out.println(times+"/"+fraction2);
        */
    }
}