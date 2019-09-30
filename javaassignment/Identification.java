import java.util.Scanner;

public class Identification{
    public static void main(String[] args){
        Identification identify=new Identification();
        identify.classify();

    }
    public void classify(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter input");
        char input=scanner.next().charAt(0);
        if(input >= 'a' && input <='z'){
            System.out.println("your enter input  is Small letter");
        }
        else if(input >= 'A' && input <= 'Z'){
            System.out.println("your entered input is Capital letter");
        }
        else if(input >= '0' && input <='9' ){
            System.out.println("your entered input is number");
        }
        else {
            System.out.println("your entered input is symboll");
        }
    }

}