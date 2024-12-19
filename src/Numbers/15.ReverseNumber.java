package Numbers;

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int reversed = 0;

        // while the digit of the number
        while (num != 0) {
            int digit = num % 10; // get the last digit
            reversed = reversed * 10 + digit; // append it to reversed number
            num /= 10;  // remove the last digit from num
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
