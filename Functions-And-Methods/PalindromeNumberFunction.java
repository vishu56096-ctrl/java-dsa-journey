import java.util.*;

public class PalindromeNumberFunction{

    public static void palindromeNum(int number){
        int orginalNum = number;
        
        int reverse = 0;
        while(0 < number){
            int lstDigit = number % 10;
            reverse = reverse * 10 + lstDigit;
            number = number / 10;
        }
        if(reverse == orginalNum){
            System.out.print("its a palindrome number ");
        }else{
            System.out.print("its a not palindrome number ");
        }
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("enter number : ");
         int  number = sc.nextInt();
         
         palindromeNum(number);

    }
}