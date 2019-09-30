import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args){
        ReverseOfString reverseofstring=new ReverseOfString();
        reverseofstring.reverse();

    }
    public void reverse(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.next();
        String reverse="";


        for (int  i=str.length()- 1;i >= 0;i--){

            reverse=reverse + str.charAt(i);
        }
        System.out.println("reverse string is:"+reverse);
    }
}
