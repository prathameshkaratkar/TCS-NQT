package Arrays;

class ReverseElement {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        reverseArray(arr,n);

    }
    static void reverseArray(int[] arr, int n) {
        int[] ans = new int[n];

        for(int i = n -1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans,n);
    }

    static void printArray(int[] ans, int n) {
        System.out.println("Reversed array is: " );
        for(int i = 0; i < n; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
