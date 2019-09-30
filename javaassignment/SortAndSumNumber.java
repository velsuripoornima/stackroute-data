import java.util.Scanner;

public class SortAndSumNumber {
    public static void main(String args[])
    {
        SortAndSumNumber sorting = new SortAndSumNumber(); //creating object for class
        sorting.sort();
    }

    public void sort() // method declaration
    {
        Scanner scanner = new Scanner(System.in); //read input
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int temp = number;
        int count = 0;
        int sum = 0;
        int sortednumber = 0;
        while (number > 0) //logic for split numbers sum
        {
            int remainder = number % 10;
            count++;
            number = number / 10;
            if(remainder % 2 ==0)
                sum = sum + remainder;
        }

        int intArr[]= new int[count];
        for(int i=0; temp > 0; i++)
        {
            intArr[i] = temp % 10; //storing individual elements in array
            temp = temp/10;
        }

        for(int i=0; i < count; i++) // sorting
        {
            for(int j=i; j < count; j++)
            {
                if(intArr[i] < intArr[j])
                {
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

        System.out.println("Sorted number in non-increasing order" + sortednumber);
        System.out.println("Sum of even numbers" + sum);
        System.out.println(sum > 15 ? true:false); //checking output
    }
}