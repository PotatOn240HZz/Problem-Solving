// Time in milliseconds: 404

import java.util.*;
public class Temp
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int times=uInput.nextInt();
        int condition=uInput.nextInt();
        int ar[]=new int [times];
        for(int i=0;i<times;i++)
            ar[i]=uInput.nextInt();
        int test=ar[condition-1];
        int winners=0;
        for(int i=0;i<times;i++)
            if(ar[i]>=test && ar[i]>0)
                winners++;
        System.out.println(winners);
    }
}