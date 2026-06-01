import java.util.*;

public class CountDigitsMethod{

    public static void countDigits(int number){

        int countDigit = 0;
        while (0 < number){
            countDigit += 1;
            number = number/10;
        }
        System.out.println(countDigit);
        
    }

    public static void main(String[] args){
           countDigits(123425);
    }
}