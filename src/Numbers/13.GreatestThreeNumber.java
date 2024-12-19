package Numbers;

import java.util.Scanner;

class GreatestThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = input.nextInt();
        System.out.println("Please enter second number: ");
        int b = input.nextInt();
        System.out.println("Please enter third number: ");
        int c = input.nextInt();

        if (a>b && a>c) {
            System.out.println("the greatest of three number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("the greatest of three number is: " + b);
        } else {
            System.out.println("the greater of three number is: " + c);
        }

    }
}
