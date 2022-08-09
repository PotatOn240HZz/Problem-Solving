// Time in milliseconds: 436

import java.util.*;
public class EzPzLmnSqz 
{
//public static int test(int testt){}
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        String input=uInput.next();
        char [] ar= new char [input.length()];
        for(int i=0;i<input.length();i++)
        {
            ar[i]=input.charAt(i);
            if(ar[i] >= 'A' && ar[i] <= 'Z')
                ar[i]+=32;
            if(ar[i]!='a' && ar[i]!='o' && ar[i]!='y' && ar[i]!='e' && ar[i]!='u' && ar[i]!='i')
                System.out.print("."+ar[i]);
        }
    }
}