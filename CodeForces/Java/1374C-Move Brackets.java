// Time in milliseconds: 249

import java.util.*;
public class Temp
{
    public static void main(String[] args) 
    {
        Scanner uInput=new Scanner(System.in);
        int times = uInput.nextInt();
        for(int i=0;i<times;i++)
        {
            int error=0;
            Stack<Character> stack = new Stack<Character>(); 
            int range=uInput.nextInt();
            String input=uInput.next();
            for(int j=0;j<range;j++)
            {
                if(input.charAt(j)=='(')
                    stack.push('(');
                else
                {
                    if(stack.empty())
                        error++;
                    else
                        stack.pop();
                }
            }
            System.out.println(error);
        }
    }
}