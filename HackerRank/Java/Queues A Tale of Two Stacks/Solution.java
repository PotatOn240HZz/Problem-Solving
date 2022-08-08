import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  Stack<Integer> stackA = new Stack<>();
  Stack<Integer> stackB = new Stack<>();
  int numOfElements = 0;
  for (int i =0; i < n; i++){
      int type = sc.nextInt();
      switch (type) {
          case (1):
          if (stackA.isEmpty() && stackB.isEmpty()){
              stackA.push(sc.nextInt());
          }
          else{
              stackB.push(sc.nextInt());
          }
          break;
          case (2):
              if (stackA.isEmpty()){
                  while(!stackB.isEmpty()){
                      stackA.push(stackB.pop());
                  }
                  stackA.pop();
              }
              else{
                  stackA.pop();
              }
              break;
          case(3):
              if (stackA.isEmpty()){
                  while(!stackB.isEmpty())
                      stackA.push(stackB.pop());
                  System.out.println(stackA.peek());
              }
              else{
                  System.out.println(stackA.peek());
              }
              break;
      }
    }
    }
}

//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem