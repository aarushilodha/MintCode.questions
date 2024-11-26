import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of terms: ");
    int terms = scanner.nextInt();
    if(terms<=0)
    {
        System.out.println("Enter a positive integer.");
    }
    else{
        System.out.println("Fibonacci series upto"+terms+" terms: ");
        printFibonacciseries(terms);
    }
    scanner.close();
}
public static void printFibonacciseries(int terms)
{
    int first = 0;
    int second = 1;
    for(int i =1; i<=terms;i++)
    {
        System.out.print(first+ " ");
        int next = first+second;
        first= second;
        second=next;
    }
    System.out.println();
}
}