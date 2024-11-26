import java.util.Scanner;

public class Factorialcalculator {
    public static long calculateFactorial(int number)
    {
        long factorial = 1;
        int i=1;
        while(i<=number)
        {
            factorial*=i;
            i++;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number<0)
        {
            System.out.println("Factorial not defined.");
        }
        else 
        {
            long factorial = calculateFactorial(number);
            System.out.println("The factorial of "+number+" is "+factorial);
        }
        scanner.close();
    } 
}
