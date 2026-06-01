import java.util.*;
public class PrimeNumberChecker{

    public static boolean  isPrime(int number){
           boolean isPrime = true;
           if(number <= 1){
                isPrime = false;
           }
           for(int i=2; i<=number-1 ; i++ ){
               if(number % i == 0){
                     isPrime = false;
                    break;
               }
           }
           return isPrime;
           
    }
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

          System.out.print("enter number : ");
          int number = sc.nextInt();

          boolean result = isPrime(number);

          if(result){
               System.out.println(number + " is a prime number.");
          }else{
               System.out.println(number + " is a not prime number. ");
          }


      }
}

//  in a main function if-else on work basies on  true flase  true is if and flase else .
