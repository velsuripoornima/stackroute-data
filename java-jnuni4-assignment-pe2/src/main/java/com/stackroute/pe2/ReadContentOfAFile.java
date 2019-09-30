package com.stackroute.pe2;


import java.io.File;
import java.io.FileReader;

public class ReadContentOfAFile {
    public int readFile(String filepath) //this method return entire file content
    {
        try{
            FileReader fr = new FileReader(filepath); //filereader used for reading file content

            File f=new File(filepath);

            int i;
            while ((i=fr.read()) != -1)

                System.out.print(Character.toUpperCase((char)i));  //file content is converting into uppercase

            return (int)f.length(); //it display length of the string
        }
        catch (Exception e)
        {
            return 0;
        }
    }
}
