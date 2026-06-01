import  java.util.*;

public class StrongNumberChecker{
    public static void StrongNum(int number){
         int orginalNum = number;
         
         int strongSum = 0;

         while(0 < number){

            int lstDigit = number % 10;
            int factorial = 1;

            for(int i=1 ; i<= lstDigit; i++){
                factorial = factorial * i;
            }

            strongSum = strongSum + factorial;

            number = number / 10;
         }
         if( strongSum == orginalNum){
            System.out.print(orginalNum + " : is a strong number ");
         }else{
            System.out.print(orginalNum + " : is a not strong number ");

         }
        
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int number = sc.nextInt();
        StrongNum(number);

    }
}

// A strong number is a positive integer whose sum of the factorials of its digits is equal to the original number itself. It is also known as a factorial    === Sum of factorial of each digit = original number

// example : 145

// Now separate digits:

// 1
// 4
// 5

// Find factorial:

// 1! = 1
// 4! = 24
// 5! = 120