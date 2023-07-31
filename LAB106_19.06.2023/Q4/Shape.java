package com.mycompany.q4;
abstract class Shape 
{
    abstract double calculateArea();
    
    void display()
    {
        System.out.println("Area - "+calculateArea());
    }
}
