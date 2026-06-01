
public class PrimeInRange {
    public static boolean isPrime(int number){
        boolean isPrime = true;
        for(int i=2 ; i<=number-1 ; i++){
            if(number % i  == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
    public static void PrimeInRange(int number){
        for(int i=1; i<=number; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        
        PrimeInRange(50);

    }
}
