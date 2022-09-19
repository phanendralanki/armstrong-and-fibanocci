//armstrong number => example => 1 = 1 , 12 = 1*1 + 2*2 , 153 = 1*1*1 + 5*5*5 + 3*3*3

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int number = input.nextInt();
        int t1 = number;
        int length = 0;

        //first we need to calculate the length of the digits in the given number
        while (t1 != 0) {
            t1 = t1 / 10;
            length = length + 1;
        }
        System.out.println("The number of digits are " + length);

        //reverse the number
        int t2 = number;
        int remainder;
        int arm = 0;
        while (t2 != 0) {
            remainder = t2 % 10;
            int multiply = 1;
            for (int i = 1; i <= length; i++) {
                multiply = multiply * remainder;
            }
            arm = arm + multiply;
            t2 = t2 / 10;

        }
        if (arm == number) {
            System.out.println(number + " is armstrong number");
        }
        else
            System.out.println(number + " is not a armstrong number");

    }
}
