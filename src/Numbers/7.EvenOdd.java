package Numbers;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = input.nextInt();
        if(remainder(n)== 0) {
            System.out.println(n + " is even.");
        }
        else{
            System.out.println(n + " is odd");
        }
    }

    public static int remainder(int n) {
        return (n % 2);
    }
}
