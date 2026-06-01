import java.util.*;

public class BinaryToDecimal{

    public static void binToDic(int binNum){
        int orginalBin = binNum;
        int power = 0;
        int dicNum = 0;

        while(0 < binNum){
            int lstDigit = binNum % 10;
            dicNum = dicNum + (lstDigit * (int)Math.pow(2,power));
            power ++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " + orginalBin + " = " + dicNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter binary number :  ");
        int binNum = sc.nextInt();
        binToDic(binNum);

    }
}
// To convert a binary number to a decimal number, you multiply each binary digit (0 or 1) by 2 raised to the power of its position (starting from 0 on the right) and sum the results.
//  Initialize decimal_number = 0
// Initialize power = 0

// While binary_number > 0:
//     1. Get the last digit: digit = binary_number % 10
//     2. Add to total:      decimal_number = decimal_number + (digit * 2^power)
//     3. Increase power:     power = power + 1
//     4. Remove last digit:  binary_number = binary_number / 10