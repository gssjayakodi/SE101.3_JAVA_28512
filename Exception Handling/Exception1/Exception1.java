package com.mycompany.exception1;
import java.util.Scanner;

public class Exception1
{
    

    public static void main(String[] args) 
    {
        int no1,no2,ans;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Frist No : ");
        no1=sc.nextInt();
        System.out.print("Enter Second No :");
        no2=sc.nextInt();
        
        try
        {
        ans=no1/no2;
        System.out.println("Answer is : "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : Divided by 0 \n"+e.getMessage());
            
        }
        
        
       
    }
}
