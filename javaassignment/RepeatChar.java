import java.util.Scanner;

public class RepeatChar {
    public static void main(String[] args){
        RepeatChar charrepeat=new RepeatChar(); //creating object for class
        charrepeat.repeat();

    }
    public void repeat(){ //method declaration
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next(); //read input
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        System.out.print(str); //printing input string
        for(int i=0;i<=number - 1;i++){
            System.out.print(str.substring(str.length() - number)); //repeat string considering the given input number
        }
    }
}
