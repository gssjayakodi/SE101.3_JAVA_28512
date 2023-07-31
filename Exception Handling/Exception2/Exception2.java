package com.mycompany.exception2;
//import java.util.Scanner;

public class Exception2 
{

    public static void main(String[] args) 
    {
        int array[]={19,12,2};
        
        try
        {
            System.out.println("Value :"+array[0]);
            System.out.println("Value :"+array[3]);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Invalid index is accessed.");
            
        }
        
        
        
    }
}
