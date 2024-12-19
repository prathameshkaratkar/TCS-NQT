package Numbers;

import java.util.Scanner;

class LeapYear {
    static boolean isYear(int year) {
        if(year % 400 == 0) return true;
        if(year % 100 ==0) return true;
        if(year % 4 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the year: ");
        int year = input.nextInt();

        if(isYear(year)) System.out.println("Yes");
        else System.out.println("No");
    }
}
