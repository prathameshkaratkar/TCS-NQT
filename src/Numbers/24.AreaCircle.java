package Numbers;

class AreaCircle {
    public static void areaOfCirle(int n) {
        double ans = 3.14 * n *n;
        System.out.println("Area of circle is : " + ans);
    }

    public static void main(String[] args) {
        int n = 5;
        areaOfCirle(n);
    }
}
