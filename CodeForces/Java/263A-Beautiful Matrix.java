// Time in milliseconds: 404

import java.util.*;
public class EzPzLmnSqz 
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int [][] ar= new int [5][5];
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
            {
                ar[i][j]=uInput.nextInt();
                if(ar[i][j]==1)
                    {System.out.println((Math.abs(3-(i+1))+Math.abs(3-(j+1)))); break;}
            }
    }
}