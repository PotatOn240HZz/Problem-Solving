// Time in milliseconds: 233

import java.util.Scanner;
public class PlzFixMe {
        public static void main(String[] args){
        Scanner uInput=new Scanner(System.in);
        int times=uInput.nextInt();
        for(int j=0;j<times;j++)
        {
        int x=uInput.nextInt();
        if(x<=0)
            System.out.println(Math.abs(x));
        else
        {
            int steps=0;
            int pointer=0;
            int i=1;
            for(;pointer<x;i++)
            {
                pointer+=i;
                steps++;
            }
            if(pointer==x+1)
                System.out.println(steps+1);
            else{
                for(int k=i;pointer>x;k--)
                {
                    pointer-=k;
                    if(k!=i)
                        steps++;
                }
                System.out.println(steps);
            }
        }
        }
    }
}