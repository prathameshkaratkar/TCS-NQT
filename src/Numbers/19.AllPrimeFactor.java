package Numbers;

import java.util.ArrayList;

class AllPrimeFactor {
    public static ArrayList<Integer> getPrimeFactors(int n) {
        // declare an arraylist to store
        // the prime factors of n.
        ArrayList<Integer> primeFactors = new ArrayList<>();

        // Loop from 2 up to n
        for(int i = 2; i<=n; i++) {
            // check if n is divisible by i
            if(n % i == 0){
                // if divisible, add i to
                // the primefactor arraylist
                primeFactors.add(i);
            }
            // continue dividing n by i
            // until its no longer divisible
            while(n % i == 0) {
                n = n/ i;
            }
        }return primeFactors;
    }

    public static void main(String[] args) {
        int n = 60;
        ArrayList<Integer> ans = getPrimeFactors(n);
        System.out.println("Prime Factors for " + n + ": ");
        for(int factor: ans) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }
}
