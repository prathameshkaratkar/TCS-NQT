package Numbers;

import java.util.Scanner;

class SumNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number till the sum: ");
        int n = input.nextInt();
        System.out.println("Total sum is " + addition(n));

    }

    static long addition(int n) {
        long sum = 0;

        for(int i=0; i<=n;i++) {
            sum += i;
        }
        return sum;
    }
}
