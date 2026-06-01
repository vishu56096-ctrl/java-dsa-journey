import java.util.*;

public class MethodOverloadingCalculator{
    public static int sum(int a, int b){
        // sum of two number
        return a + b;
    }
    public static int sum(int a , int b , int c){
        // sum of three number
        return  a + b + c;
    }
    public static void main(String[] args){
        System.out.println(sum(2,3));
        System.out.println(sum(10,20,30));

    }
}