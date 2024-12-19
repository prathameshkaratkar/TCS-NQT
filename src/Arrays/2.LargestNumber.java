package Arrays;

class LargestNumber {
    public static void main(String[] args) {
        int[] arr1 = {2,5,1,3,0};
        System.out.println("The smallest element in the array is: " + LargeElement(arr1));

        int[] arr2 = {8,10,5,7,9};
        System.out.println("The smallest element in the array is: " + LargeElement(arr2));
    }

    static int LargeElement(int[] arr) {
        int max = arr[0];

        for(int i = 0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

