public class ArrayPrinter{
    public static void printArray(int[] array)
    {
        System.out.println("Array Elements: ");
        for(int element : array)
        {
            System.out.print(element +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50 };
        printArray(numbers);
    }
}