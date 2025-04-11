public class PrimeNumber {
    public static void main(String[] args){
        int [] array ={2,3,4,5,6,7,9};
        int count =0;
        for(int i=0; i<array.length; i++){
            int num = array[i];
            boolean isPrime = true;
            if(num<=1){
                isPrime=false;
            }
            else{
                for(int j=2;j<num;j++){
                    if(num%j==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println("Number of prime numbers: "+count);
    }
}
