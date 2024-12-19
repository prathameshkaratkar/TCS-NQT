package Numbers;

class Factorial {
   public static long findFactorial(int n) {
       if( n == 0 || n == 1) {
           return 1;
       }
       return n * findFactorial(n-1);
   }

   public static void main(String[] args) {
       int n = 5;
       long result = findFactorial(n);
       System.out.println("the factorial of " + n + " is " + result);
   }
}
