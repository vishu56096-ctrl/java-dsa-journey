import java.util.*;

public class DecimalToBinary{
    public static void decToBin(int decNum){
        int orginalDecNum = decNum;
         int power = 0;
         int binNum = 0;

         while(0 < decNum){
            int remender = decNum % 2;

            binNum = binNum + (remender * (int) Math.pow(10,power));
            power ++;
            decNum = decNum / 2;
         }
         System.out.println("binary of "+ orginalDecNum + " = " + binNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter binary number : ");
        int decNum = sc.nextInt();
        decToBin(decNum);

    }
}
// To convert a decimal number to binary, repeatedly divide the number by 2, record the remainders (0 or 1), and then read those remainders in reverse order from the last one calculated to the first.