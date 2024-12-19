package Numbers;


import java.util.Scanner;

class GreaterNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = input.nextInt();
        System.out.println("Please enter second number: ");
        int b = input.nextInt();
        if(a>b) {
            System.out.println(a + " is the greater than b");
        } else {
            System.out.println(b + " is the greater than a");
        }
    }
}
