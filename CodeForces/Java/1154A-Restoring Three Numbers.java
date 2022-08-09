// Time in milliseconds: 202

import java.util.*;
public class EzPzLmnSqz 
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int [] ar=new int [4];
        for(int i=0;i<4;i++)
            ar[i]=uInput.nextInt();
        int max=(Math.max(Math.max(Math.max(ar[0], ar[1]), ar[2]),ar[3]));
        for(int i=0;i<4;i++)
            if(ar[i]==max)
                ar[i]=ar[3];
        System.out.println(max-ar[0]);
        System.out.println(max-ar[1]);
        System.out.println(max-ar[2]);
    }
}