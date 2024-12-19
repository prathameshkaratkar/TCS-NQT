package Numbers;

import java.util.Scanner;

class ArmstrongNumber {
    public static boolean isArmStrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while(num> 0) {
            // extract the last digit
            int digit = num % 10;

            // raise digit to power of total digit
            sum += Math.pow(digit, digits);

            // remove last digit
            num /= 10;
        }
        // check if sum equals original number
        return sum == originalNum;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an armstrong number: ");
        int number = input.nextInt();

        if(isArmStrong(number)) {
            System.out.println(number+ " is an armstrong number");
        } else {
            System.out.println(number + "is not an armstorng number" );
        }
    }
}
