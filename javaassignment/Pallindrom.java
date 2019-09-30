import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //read input
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int temp=number;
        int sum=0,remainder,rev=0;

        while (number > 0){ //condition
            remainder=number % 10;
            rev= rev * 10 + remainder;
            if(remainder % 2 ==0)
            sum=remainder + sum;
            number=number/10;
        }

        if(rev==temp){
            if(sum >25){
                System.out.println(temp + "the given number is pallindrom and sum of even number is greater than 25");
            }
            else {
                System.out.println(temp+ "the entered number is pallindrom and sum of all even numbers is lessthan 25");
            }

        }
        else {
            System.out.println(temp+"the given number is not a pallindrom");
        }
    }
}
