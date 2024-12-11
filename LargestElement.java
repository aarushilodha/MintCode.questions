public class LargestElement {
    public static int findLargestElement(int[] array){
        int largest = array[0];
        for(int element : array){
            if(element > largest)
            {
                largest = element;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int largest = findLargestElement(numbers);
        System.out.println("The Largest element of array: " + largest);
    }
}
