import java.util.*;

public class FibonacciUsingMethod{

    public static void Fibonacci(int number){
        int orginal = number;
        int fibo = 1;
        for(int i=1; i <= number; i++){
            fibo = fibo * i;
        }
        System.out.println("fibonacci is " + orginal +  " = " + fibo);
     }
    public static void main(String[] args){
         Fibonacci(5);
    }
}