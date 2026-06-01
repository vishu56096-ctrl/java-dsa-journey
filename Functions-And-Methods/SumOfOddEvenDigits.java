import java.util.*;

public class SumOfOddEvenDigits{

    public static void sumOfOddEven(int number){
           int  odd = 0;
           int even = 0;

           while(0 < number){
              int lstDigit = number %  10;
              if(lstDigit % 2 == 0){
                even = even + lstDigit;
              }else{
                odd = odd + lstDigit;
              }
              number = number / 10;
           }
           System.out.println("sum of even number : " + even);
           System.out.println("sum of odd number : " + odd);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter  number : ");
        int number = sc.nextInt();

        sumOfOddEven(number);


    }
}