
public class ArmstrongNumberFunction {

    public static void armStrongNum(int number){
        int orginalNumber = number;
        int tempNumber = number;
        int NumDigit = 0;
        int DigitSqrSum = 0;

        while(0 < number){
            NumDigit += 1;
            number = number / 10;
        } 
        while(0 < tempNumber ){
            int lstDigit = tempNumber % 10;
            DigitSqrSum = DigitSqrSum + (int)Math.pow(lstDigit,NumDigit);
            tempNumber = tempNumber / 10;
        }
        if(DigitSqrSum == orginalNumber){
             System.out.println("Armstrong Number ");
        }
        else {
            System.out.println("Not Armstrong Number ");
        }
        
     }
    public static void main(String[] args) {
        armStrongNum(123);
        
    }
    
}
// An Armstrong number is a special mathematical number. It means a number that is equal to the sum of its own digits, where each digit is raised to a power equal to the total number of digits.

// If a number has \(n\) digits, you take each digit, raise it to the power of \(n\), and add them all together. If the result matches your original number, it is an Armstrong number

// use two variable for a compare and use second loop because in this question real number is 0  when do first loop so, i am take a two variable one orginal number and second temp.. number 

//  example : 370 is an Armstrong number.
// \(370 = 3^3 + 7^3 + 0^3\)\(370 = 27 + 343 + 0\)\(370 = 370\)
