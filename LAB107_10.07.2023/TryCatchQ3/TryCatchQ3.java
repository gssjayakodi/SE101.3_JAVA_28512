package com.mycompany.trycatchq3;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class TryCatchQ3
{

    public static void main(String[] args)
    {
        try
        {
            File sc = new File("myfile.txt");
            Scanner scanner = new Scanner(sc);

                while (scanner.hasNextLine())
                    {
                        String Line=scanner.nextLine();
                        System.out.println(Line);
                    }
            scanner.close();
        } 
        catch (FileNotFoundException e)
        {
          System.out.println("File is not found \n"+e);
        }
    }
}