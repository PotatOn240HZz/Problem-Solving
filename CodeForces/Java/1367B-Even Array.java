// Time in milliseconds: 249

import java.util.*;
public class EzPzLmnSqz 
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int input=uInput.nextInt();
        for(int i=0;i<input;i++)
        {
            int digits=uInput.nextInt();
            int [] temp=new int [digits];
            int right=0,wrong1=0,wrong2=0;
            for(int j=0;j<digits;j++)
            {
                temp[j]=uInput.nextInt();
                if(j%2==0 && temp[j]%2==0)
                {
                    right++;
                }
                else if(j%2==1 && temp[j]%2==1)
                {
                    right++;
                }
                else if(temp[j]%2==1)
                    wrong1--;
                else
                    wrong2--;
             }
            if(right==digits)
                System.out.println(0);
            else if(wrong1==wrong2 && wrong1!=0)
                System.out.println(Math.abs(wrong1));
            else 
                System.out.println(-1);
        }
    }
}