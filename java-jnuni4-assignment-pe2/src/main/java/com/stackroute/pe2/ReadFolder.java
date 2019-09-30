package com.stackroute.pe2;

import java.io.*;

public class ReadFolder
{
    public ReadFolder() //creating constructor for class
    {

    }
    public String[] getFolderFilenames(String filepath, String extention) //taking method contains two parameters
    {
        try {

            File folder = new File(filepath);  //creating instance variable for class file

            int i = 0;

            File[] files = folder.listFiles(new FilenameFilter() {  //we are using inbuilt method
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith("." + extention);
                }
            });

            String[] filenames = new String[files.length];

            for (File file : files) {

                System.out.println(file.getName());

                filenames[i++] = file.getName();

                FileInputStream fileInputStream = new FileInputStream(file);

                byte byteFileContent[] = new byte[(int) file.length()];

                fileInputStream.read(byteFileContent);

                String fileContent = new String(byteFileContent);

                System.out.println(fileContent);
            }

            return filenames;

        }catch (Exception exception)
        {
            return null;
        }
    }
}
