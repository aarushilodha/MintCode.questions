import java.util.Scanner;

public class SecondLargest {
    public static int findSecondLargest(int[] array){
        if(array.length<2){
            return Integer.MAX_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num: array){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num >= secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element in array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i =0; i<size;i++){
            array[i] = scanner.nextInt();
        }
        int secondLargest = findSecondLargest(array);
        if(secondLargest != Integer.MIN_VALUE){
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
        else{
            System.out.println("No second largest element exist.");
        }
        scanner.close();
    }
}
