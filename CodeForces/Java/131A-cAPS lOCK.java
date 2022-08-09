// Time in milliseconds: 218

import java.util.*;
public class EzPzLmnSqz 
{
//public static int test(int testt){}
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        String input=uInput.next();
        char [] ar=new char [input.length()];
        int count=0;
        ar[0]=input.charAt(0);
        for(int i=1;i<input.length();i++)
            {
                ar[i]=input.charAt(i);
                if(ar[i]>='A' && ar[i]<='Z')
                    count++;
            }
        if(count == input.length()-1)
        {
            for(int i=0;i<input.length();i++)
            if(ar[i]>='a' && ar[i]<='z')
                System.out.print((char)(ar[0]-32));
            else
                System.out.print((char)(ar[i]+32));
        }
        else
            System.out.println(input);
    }
}