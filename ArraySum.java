public class ArraySum {
    public static int calculateSum(int[] array){
        int sum =0;
        for(int element : array)
        {
            sum += element;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers= {10, 20, 30, 40, 50};
        int sum = calculateSum(numbers);
        System.out.println("The sum of array element is: " +sum);
    }
}
