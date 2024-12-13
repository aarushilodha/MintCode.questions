import java.util.Scanner;

public class Array2D {
    public static void print2DArray(int [] [] array)
    {
        System.out.println("The 2D array is: ");
        for(int[] row : array){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter elemnts of 2D array:");
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        print2DArray(array);
        scanner.close();
    }
}
