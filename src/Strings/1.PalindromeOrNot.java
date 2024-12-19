package Strings;

class PalindromeOrNot {

    static boolean palindrome(int i, String s) {
        // base condition
        // if i exceeds half of the string, means all the element
        // are compared, we return true

        if(i>= s.length()/2) return true;

        // if start is not equal to end, not palindrome
        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        // if both character are same, increment i and check
        // start + 1 and end - 1;

        return palindrome(i+1, s);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindrome(0,s));
    }
}
