public class ArrayReverse {
    public static void printReverse(int[] array){
        System.out.println("The reverse of array is: ");
        for(int i = array.length-1 ; i>=0; i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printReverse(numbers);
    }
}
