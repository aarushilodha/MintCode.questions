import java.util.Scanner;

public class Divisibilitycheck {
    public static String divisibleby3and5(int number)
    {
        return (number%3==0 && number%5==0)
        ? "The number is divisible by both 3 and 5."
        : "The number is not divisible by both 3 and 5.";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = divisibleby3and5(num);
        System.out.println(result);
    }
}
