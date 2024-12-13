import java.util.HashMap;
import java.util.Scanner;

public class ArrayFrequency {
    public static void printElementfrequency(int[] array){
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num : array){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of each element in the array:");
        for(int key : frequencyMap.keySet()){
            System.out.println(key +" : " + frequencyMap.get(key));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of elements in the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<size; i++)
        {
            array[i] = scanner.nextInt();
        }
        printElementfrequency(array);
        scanner.close();
    }
}
