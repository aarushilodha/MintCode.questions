public class MinMax {
    public static int findLargest(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static int findSmallest(int [] arr){
        int min = arr[0];
        for(int num: arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array ={10,25,5,17,40,2};

        int largest = findLargest(array);
        int smallest = findSmallest(array);

        System.out.println("Largest: " +largest);
        System.out.println("Smallest: " +smallest);
    }
}
