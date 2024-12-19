package Numbers;

class FibonacciSeries {
    static int Recursion(int N) {
        // base condition
        if(N <= 1) {
            return N;
        }
        // problem broken down into 2 functional calls
        // and their results combined and returned
        int last = Recursion(N - 1);
        int slast = Recursion(N - 2);

        return last + slast;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Fibonacci series up to " + N +  " terms:");
        for(int i = 0; i< N; i++ ) {
            System.out.print(Recursion(i) + " ");
        }
    }
}
