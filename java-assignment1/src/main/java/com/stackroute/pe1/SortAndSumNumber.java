package com.stackroute.pe1;
import java.util.Scanner;

public class SortAndSumNumber {

    public String sort(int number) // method declaration
    {

        int temp = number;
        int count = 0;
        int sortednumber = 0;
        while (number > 0) //logic for split numbers sum
        {
//            int remainder = number % 10;
            count++;
            number = number / 10;

        }

        int intArr[] = new int[count];
        for (int i = 0; temp > 0; i++) {
            intArr[i] = temp % 10; //storing individual elements in array
            temp = temp / 10;
        }

        for (int i = 0; i < count; i++) // sorting
        {
            for (int j = i; j < count; j++) {
                if (intArr[i] < intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }


        for(int i=0; i<count; i++) //merge and add individual numbers
        {
            sortednumber = sortednumber*10 + intArr[i];
        }

        this.sumOfEven(sortednumber);

      return "Sorted number in non-increasing order " + sortednumber ;


//        System.out.println(sortednumber);
    }
    public int sumOfEven(int number){

        int sum = 0;
        while (number > 0) //logic for split numbers sum
        {
            int remainder = number % 10;
            number = number / 10;
            if (remainder % 2 == 0)
                sum = sum + remainder;
        }
        this.checkSumLimit(sum);
        return sum;
    }

    public boolean checkSumLimit(int sum){
        return ( sum>15 ? true :false);
    }
    }
