package Numbers;

class PrimeOrNot {
    static boolean checkPrime(int n){
        // initialize a counter variable to
        // count the number of factors
        int cnt = 0;
        // loop through numbers from 1 to n.
        for(int i = 1; i<=n; i++) {
            // if n is divisible by i;
            // without any remainder
            if(n%i == 0) {
                // increment the counter
                cnt = cnt + 1;
            }
        }
        // if the number of
        // factor is exactly 2
        if(cnt == 2) {
             // return true, indicating the
            // number is prime
            return true;
        } else {
            // return false, indicating
            // that the number is not prime
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if(isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
