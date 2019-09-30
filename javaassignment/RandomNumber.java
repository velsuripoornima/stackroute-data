import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args){
        RandomNumber randomnumber=new RandomNumber();
        randomnumber.random();

    }
    public void random(){
        Random random=new Random();
        int number=random.nextInt(50);
        int usernumber=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your guessing number between 1 to 50: ");
        while (number != usernumber){
            System.out.println("enter your guessing number:");
            usernumber=scanner.nextInt();
            if(number > usernumber){
                System.out.println("your guessing number is less than original number");
            }
            else if(number < usernumber){
                System.out.println("your guessing number is more than original number");
            }
            else{
                System.out.println("your guessing number is equal to original nunber");
                break;
            }
        }

    }
}
