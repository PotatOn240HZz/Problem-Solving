// Time in milliseconds: 202

import java.util.*;
public class Temp 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        long n=input.nextInt(),m=input.nextInt(),a=input.nextInt();
        System.out.println((long)Math.ceil((double)n/a)*(long)Math.ceil((double)m/a));
    }
}