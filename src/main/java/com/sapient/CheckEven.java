package com.sapient;

import java.util.Scanner;

public class CheckEven 
{
    public static boolean check(int n)
    {
      if(n%2==0) return true;
      return false;
    }
    public static void main (String[] args) 
    {
		System.out.println ("Enter a number");
                Scanner s= new Scanner(System.in);
                int value=s.nextInt();
                boolean answer= check(value);
                if(answer==true)
                System.out.println("The entered number is an even number");
                else
                System.out.println("The entered number is an odd number");
    }
}
