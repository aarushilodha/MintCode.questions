public class EvenOdd {
    public static void CountEvenOdd(int[] array)
    {
        int evencount = 0;
        int oddcount = 0;
        for(int element : array)
        {
            if(element % 2==0)
            {
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Count of even numbers: " +evencount);
        System.out.println("Count of odd numbers: " +oddcount);
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        CountEvenOdd(numbers);
    }
}
