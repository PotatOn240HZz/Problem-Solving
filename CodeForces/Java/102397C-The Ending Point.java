// Time in milliseconds: 218

import java.util.*;
public class EzPzLmnSqz 
{
//public static int test(int testt){}
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int x=uInput.nextInt();
        int y=uInput.nextInt();
        String pos=uInput.next();
        for(int t=0;t<pos.length();t++)
        {
            if(pos.charAt(t)=='U')
                y++;
            else if(pos.charAt(t)=='D')
                y--;
            else if(pos.charAt(t)=='L')
                x--;
            else
                x++;
        }
        System.out.println(x+" "+y);
    }
}