import java.util.Scanner;

public class SumOfIntegers {
        public static void main(String args[]) {
            SumOfIntegers sumOfIntArguments = new SumOfIntegers();
            sumOfIntArguments.getSumOfArguments();
             }

        public void getSumOfArguments()
        {
            int sum =0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the integer arguments");
            String numbers = scanner.nextLine();
            String[] arr= numbers.split(" ");
            int[] intarr=new int[arr.length];

            for(int i=0;i<arr.length;i++) {
                try {
                    intarr[i] = Integer.parseInt(arr[i]);
                }
                catch (Exception e)
                {
                    System.out.println("Please enter all integers");
                    System.exit(0);
                }
                sum = sum + intarr[i];
            }

            System.out.println(sum);
        }

}
