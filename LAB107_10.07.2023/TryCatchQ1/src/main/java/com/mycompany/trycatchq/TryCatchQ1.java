package com.mycompany.trycatchq;
import java.util.Scanner;
public class TryCatchQ01
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Integer");
        int num1=sc.nextInt();
        System.out.println("Enter second Integer");
        int num2=sc.nextInt();
        try
        {
            int ans=num1/num2;
            System.out.println("Answer "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : Number divide by zero is not allowed \n"+e);
        }
    }
}
