import java.util.Scanner;

public class Check_number {
    public static void checkNumber(int number)
    {
        if(number>0){
            System.out.println("The number is positive.");
        }
        else if(number<0)
        {
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is zero.");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= scanner.nextInt();
        checkNumber(number);
        scanner.close();
    }
}
