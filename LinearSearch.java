import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int[] array, int element){
        for(int i =0; i< array.length; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i<size; i++){
            array[i] = scanner.nextInt();
        } 
        System.out.println("Enter the element to search:");
        int element = scanner.nextInt();
        int result = linearsearch(array, element);
        if(result != -1)
        {
            System.out.println("Element found at index: " +result);
        }
        else{
            System.out.println("Element not found at index.");
        }
        scanner.close();
    }
}
