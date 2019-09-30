package com.stackroute.pe3;

public class ExceptionChecker {
    public ExceptionChecker(){

    }
    public String isException(String word){
        try{

            int index=word.indexOf("a");
            String demo[] = new String[index];
            String len[]=word.split(word);

            for(int i=0;i<word.length();i++){
                len[i]=len[i+1];
                System.out.println(word);
            }

        }
        catch (NullPointerException npe){
            return "NullPointerException";
        }
        catch (IndexOutOfBoundsException iobe){
            return "IndexOutOfBoundException";
        }
        catch (NegativeArraySizeException nase){
            return "NegativeArraySizeException";
        }
        return null;
    }

}
