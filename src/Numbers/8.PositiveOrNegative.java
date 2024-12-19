package Numbers;

import java.util.Scanner;

class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = input.nextInt();
        check(n);
    }
    public static void check(int n) {
        if(n > 0) {
            System.out.println(n + " is a positive");
        }
        else {
            System.out.println(n + " is a negative");
        }
    }
}
