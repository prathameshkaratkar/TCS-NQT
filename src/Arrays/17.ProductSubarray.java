package Arrays;

/*
    Kadane's Algorithm :-
    1. Initially store 0th index value i prod1,prod2 and result
    2. Traverse the array from 1st index
    3. For each element, upload prod1, prod2
    4. prod1 is maximum of current element, product of current
    element and prod1, product of current element and prod2
    5. prod2 is minimum of current element, product of current element
    and prod1, product of current element and prod2
    6. return maximum of result and prod1
*/

class ProductSubarray{
    static int maxProductSubArray(int[] arr) {
        int prod1 = arr[0], prod2 = arr[0], result = arr[0];

        for(int i = 1; i<arr.length;i++) {
            int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
            prod1 = temp;
            
            result = Math.max(result, prod1);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,-3,0,-4,-5};
        int answer = maxProductSubArray(nums);
        System.out.println("The maximum product subarray is: " + answer);
    }
}

