package Numbers;

class PalindromeOrNot {
    static boolean palindrome(int n) {
        // initialize a variable to
        // store the reverse of the number
        int revNum = 0;
        // create a duplicate variable to
        // store the original number
        int dup = n;
        // iterate through each digit of
        // the number until it becomes 0
        while (n > 0) {
            // extract the last
            // digit of the number
            int ld = n % 10;
            // build the reverse number
            // by appending the last digit
            revNum = (revNum *10) + ld;
            // remove the last digit
            // from the original number
             n = n / 10;
        }
        // check if the original number
        // is equal to its reverse
        if(dup == revNum) {
             // if equal returns true
            // indicate its a palindrome
            return true;
        } else {
            // if not equal, return false
            // indicating its not a palindrome
            return false;
        }
    }

    public static  void main(String[] args) {
        int number = 4554;

        if(palindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

}
