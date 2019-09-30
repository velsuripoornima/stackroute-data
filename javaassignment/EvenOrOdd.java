import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        EvenOrOdd evenorodd=new EvenOrOdd();
        System.out.println(evenorodd.odd(number));

    }
    public String odd(int number){
        String result=null;
        if(number % 2 != 0 &&(number >20 && number < 30)){
            result="Tom";

        }else if(number % 2 == 0 &&(number >20 && number < 30)){
            result ="Jerry";

        }
        return result;

    }
}
