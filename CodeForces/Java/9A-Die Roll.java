// Time in milliseconds: 404

import java.util.*;
public class Temp
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner (System.in);
        int x=uInput.nextInt();
        int y=uInput.nextInt();
        if(y>x)x=y;
        switch(x)
        {
            case 1:System.out.println("1/1");break;
            case 2:System.out.println("5/6");break;
            case 3:System.out.println("2/3");break;
            case 4:System.out.println("1/2");break;
            case 5:System.out.println("1/3");break;
            case 6:System.out.println("1/6");break;
        }
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