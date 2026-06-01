import java.util.*;

public class ReverseNumberFunction{
    public static void reverseNum(int number){
        int reverse = 0;

        while (0 < number){
            int lstDigit = number % 10;
            reverse = reverse * 10 + lstDigit;
            number = number / 10;
        }
        System.out.println("reverse number is : " + reverse);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int number = sc.nextInt();
        reverseNum(number);




    }
}