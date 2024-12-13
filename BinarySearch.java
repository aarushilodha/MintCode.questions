import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch(int[] array , int target){
        int left = 0, right = array.length -1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the element of array in sorted order: ");
        for(int i=0;i<size;i++){
            array[i]= scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        int result = binarysearch(array , target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }
        else{
            System.out.println("Element not found at index.");
        }
        scanner.close();
    }
}
