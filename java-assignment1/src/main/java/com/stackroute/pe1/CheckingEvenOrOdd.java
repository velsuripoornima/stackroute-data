package com.stackroute.pe1;


public class CheckingEvenOrOdd {
       public String isEvenOrOdd(int number) {  //isEvenOrOdd is method name

           if (number % 2 != 0 && (number > 20 && number < 30)) //it checks the given num is even and is between 20 t0 30
           {
               return "Tom";  //if condition pass print tom

           } else if( number % 2 == 0 && (number > 20 && number < 30)) {
               return "Jerry";

           }else {
               return null;
           }

       }

}
