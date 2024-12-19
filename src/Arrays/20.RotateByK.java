package Arrays;

/*
    Using Reversal Algorithm:-
        1. Reverse the last k elements of the array
        2. Reverse the first n-k elements of the arrays
        3. Reverse the whole array
 */

class RotateByK {
    public static void Reverse(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to Rotate k elements to right
    public static void RotateToRight(int[] arr, int n, int k) {
        // Reverse first n-k element
        Reverse(arr, 0, n-k-1);

        // Reverse last k elements
        Reverse(arr,n-k,n-1);

        // Reverse whole array
        Reverse(arr,0,n-1);
    }

    public static void RotatetoLeft(int[] arr, int n, int k) {
        //Reverse first k elements
        Reverse(arr,0,k-1);

        //Reverse last n-k elements
        Reverse(arr,k,n-1);

        //Reverse whole array
        Reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        RotateToRight(arr,n,k);
        System.out.println("After Rotating the k element ot right ");
        for(int i = 0; i< n;i++ ) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        RotatetoLeft(arr,n,k);
        System.out.println("After Rotating the k element at left ");
        for(int i = 0; i< n;i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
