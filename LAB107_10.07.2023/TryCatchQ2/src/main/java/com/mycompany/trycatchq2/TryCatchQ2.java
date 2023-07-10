package com.mycompany.trycatchq2;
public class TryCatchQ2 
{

    public static void main(String[] args)
    {
       int[] number={1,2,3,4,5};
       try
       {
          int value=number[10];
           System.out.println("Value : "+value);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Error : Array index is out of bounds \n"+e);
       }
    }
}
