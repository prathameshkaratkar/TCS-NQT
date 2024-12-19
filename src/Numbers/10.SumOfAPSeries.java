package Numbers;

/*
    This approach is now a time as well as a space optimized
    approach since we are going to use the direct formula
    for this

    Sn = (n/2) * (2a + (n-1)*d);
    Where-
        n = number of terms
        Sn = sum of n terms
        a = first term
        d = common difference
 */

class SumOfAPSeries {
    static double sumofAp(double a, double d, double n) {
        double sum = (n/2.0) *(2.0 * a + (n -1) *d);
        return sum;
    }

    public static void main(String[] args) {
        double a = 1.5, d = 3, n = 5;
        System.out.println("Sum of given AP series: " + sumofAp(a,d,n));
    }
}
