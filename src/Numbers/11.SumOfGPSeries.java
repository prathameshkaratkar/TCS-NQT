package Numbers;

/*
    Geometric Progression :-
        1. just run the iteration one by one and add terms of G.P
        eg.
            a = 2, r= 2, n = 4
            initially, sum = 0
            first term, a = 2, sum = 2
            second term, ar = 4, sum = 4
            third term ar2 = 8, sum = 14
            fourth term ar3 = 16, sum  = 30
 */

class SumOfGPSeries {
    public static double SumofGP(double a, double r, int n) {
        double sum = 0.0;
        for(int i= 0; i<n;i++) {
            sum += a;
            a = a*r;
        }
        return sum;
    }
    public static void main(String[] args) {
        double a = 2.0;
        double r = 1.5;
        int n = 4;
        System.out.println("Sum of GP series is " + SumofGP(a,r,n));
    }
}
